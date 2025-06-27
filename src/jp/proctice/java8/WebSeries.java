package jp.proctice.java8;

import java.util.Comparator;

public class WebSeries {

    private String name;
    private String desc;
    private Double rating;

    public WebSeries(String name, String desc,Double rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}

class UseComparator implements Comparator<WebSeries> {

    @Override
    public int compare(WebSeries ws1, WebSeries ws2) {
        return Double.compare(ws1.getRating(), ws2.getRating());
    }
}