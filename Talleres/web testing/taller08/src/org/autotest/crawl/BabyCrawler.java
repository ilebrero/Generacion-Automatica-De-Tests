package org.autotest.crawl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import org.jsoup.Connection;
import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.UnsupportedMimeTypeException;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class BabyCrawler {

	private final Logger logger;

	public BabyCrawler() {
		this(new Logger());
	}

	public BabyCrawler(Logger logger) {
		this.logger = logger;
	}
	
	public WebSite crawl(String domainUrl) {
        WebSite website = new WebSite(domainUrl);
        Set<String> visitedLinks = new HashSet();

	    Stack<String> nextLinks = new Stack();
        nextLinks.add(domainUrl);

	    logger.logStart();

	    while(!nextLinks.empty()) {
	        String currentUrl = nextLinks.pop();
            visitedLinks.add(currentUrl);

            // Descomentar para ver las url que se van navegando
            //logger.logVisitingUrl(currentUrl);

            try {
                Set<String> newLinks = navigate(currentUrl);
                updateWebLinks(website, currentUrl, newLinks);
                int newLinksAmount = updateNextLinks(nextLinks, newLinks, visitedLinks, website.getDomainUrl());

                // Descomentar para ver cuantos links se agregaron
                //logger.logNumberOfLinks(currentUrl, newLinks.size(), newLinksAmount);
            } catch (HttpStatusException e) {
                // Cuando hay acentos la excepcion encodea el caracter, se lo revierte
                website.addHttpStatusException(e.getStatusCode(), e.getUrl().replace("%C3%B3", "ó"));
            } catch (MalformedURLException e) {
                website.addMalformedUrl(e.getMessage());
            } catch (UnsupportedMimeTypeException e) {
                website.addUnsupportedMimeType(e.getMimeType(), e.getUrl());
            } catch (IOException e) {
                website.addIOException(e, currentUrl);
            }

            // Descomentar para ver estadisticas de lo que se va navegando.
            //logger.logStatistics(visitedLinks.size(), nextLinks.size());
        }

		logger.logEnd();
		return website;

	}

    private int updateNextLinks(Stack<String> nextLinks, Set<String> newLinks, Set<String> visited, String domainUrl) {
        int linksamount = 0;

        for (String newLink : newLinks) {

            if (newLink.startsWith(domainUrl) && !visited.contains(newLink) && !nextLinks.contains(newLink)) {
                nextLinks.add(newLink);
                linksamount++;
            }
        }

        return linksamount;
    }

    private void updateWebLinks(WebSite website, String currentUrl, Set<String> links) {
        for (String link : links) {
            if (link.startsWith(website.getDomainUrl())) {
                website.addInternalLink(currentUrl, link);
            } else {
                website.addExternalLink(currentUrl, link);
            }
        }
    }

    private Set<String> navigate(String url) throws IOException {
	    HashSet<String> links = new HashSet();

        String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64)";
        USER_AGENT += " AppleWebKit/535.1 (KHTML, like Gecko)";
        USER_AGENT += " Chrome/13.0.782.112 Safari/535.1";

        try {
            Connection connection = Jsoup.connect(url).userAgent(USER_AGENT);
            Document htmlDocument = connection.get();
            Elements linksOnPage = htmlDocument.select("a[href]");

            for (Element elem : linksOnPage) {
                links.add(elem.absUrl("href"));
            }

            return links;
        } catch (IllegalArgumentException ex) {
           if (ex.getCause()!=null && ex.getCause() instanceof  MalformedURLException)  {
               throw (MalformedURLException)ex.getCause();
           }
           throw ex;
        }
    }

}
