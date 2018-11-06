package com.gfaw03d2;

public class UrlFixer {
    public static void main(String... args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";
        String url2 = url.replace("bots", "odds");

        System.out.println(url2);


    }
}
