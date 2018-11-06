package org.autotest.crawler;

import org.autotest.crawl.BabyCrawler;
import org.autotest.crawl.Logger;
import org.autotest.crawl.WebSite;
import org.junit.Test;

import java.io.IOException;

public class BabyCrawlerTest {

	@Test
	public void testCrawlerEj1() throws IOException {
		Logger logger = new Logger();
		BabyCrawler crawler = new BabyCrawler(logger);
		WebSite website = crawler.crawl("https://sbst2017.lafhis.dc.uba.ar/");
		logger.logResults(website);
	}

    @Test
    public void testCrawlerEj2() throws IOException {
        Logger logger = new Logger();
        BabyCrawler crawler = new BabyCrawler(logger);
        WebSite website = crawler.crawl("https://icc.fcen.uba.ar/");
        logger.logResults(website);
    }


    @Test
    public void testCrawlerEj3() throws IOException {
        Logger logger = new Logger();
        BabyCrawler crawler = new BabyCrawler(logger);
        WebSite website = crawler.crawl("https://www.dc.uba.ar/");
        logger.logResults(website);
    }
}