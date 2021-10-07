package com.wlqmpek.myweatherapp.Util;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;
import com.gargoylesoftware.htmlunit.html.HtmlTable;
import com.gargoylesoftware.htmlunit.html.HtmlTableCell;
import com.gargoylesoftware.htmlunit.html.HtmlTableRow;
import com.mysql.cj.result.Row;
import com.wlqmpek.myweatherapp.models.City;
import org.springframework.stereotype.Service;

import java.io.IOException;

public class Scraper {
    static WebClient webClient = new WebClient(BrowserVersion.CHROME);

    public static City scrapeForCity(String cityName) {
        System.out.println(cityName);
        try {


            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
            webClient.getOptions().setJavaScriptEnabled(true);

            webClient.getOptions().setThrowExceptionOnScriptError(false);
            webClient.getOptions().setPrintContentOnFailingStatusCode(false);
            HtmlPage page = webClient.getPage("https://www.gps-latitude-longitude.com/gps-coordinates-of-" + cityName);
            webClient.waitForBackgroundJavaScript(3000);

            webClient.getCurrentWindow().getJobManager().removeAllJobs();
            webClient.close();
            HtmlTable table = (HtmlTable) page.getByXPath("//table");
            for(HtmlTableRow tableRow : table.getRows()) {
                for(HtmlTableCell tableCell : tableRow.getCells()){
                    System.out.println(tableCell.asNormalizedText());
                }
            }


        } catch (IOException e) {
            System.out.println("An error occurred: " + e);
        }

        return null;
    }
}
