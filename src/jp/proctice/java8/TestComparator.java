package jp.proctice.java8;

import jp.proctice.list.LinklistImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) {
        List<WebSeries> webSeriesList = new ArrayList<>();

        webSeriesList.add(new WebSeries("panchayt", "it is based on village panchayat", 5.0));
        webSeriesList.add(new WebSeries("Mufasa", "it is based on lions life", 4.0));
        webSeriesList.add(new WebSeries("friends", "it is based on best friends life", 3.5));

        Collections.sort(webSeriesList, new UseComparator());

        for (WebSeries webSeries : webSeriesList) {
            System.out.println(webSeries.getName() + "  " + webSeries.getDesc() + "  " + webSeries.getRating());
        }
    }
}
