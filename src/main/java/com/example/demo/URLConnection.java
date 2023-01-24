package com.example.demo;

import javax.print.DocFlavor;
import java.net.URL;

public class URLConnection {
    public static void main(String[] args) {
        URL url = null;
        String address = "https://velog.io/@jyyoun1022";

        try {
            url = new URL(address);
            java.net.URLConnection conn = url.openConnection();
            System.out.println("conn = " + conn);
            System.out.println("conn.getAllowUserInteraction() = " + conn.getAllowUserInteraction());
            System.out.println("conn.getConnectTimeout() = " + conn.getConnectTimeout());
            System.out.println("conn.getContent() = " + conn.getContent());
            System.out.println("conn.getContentEncoding() = " + conn.getContentEncoding());
            System.out.println("conn.getContentLength() = " + conn.getContentLength());
            System.out.println("conn.getContentType() = " + conn.getContentType());
            System.out.println("conn.getDate() = " + conn.getDate());
            System.out.println("conn.getDefaultUseCaches() = " + conn.getDefaultUseCaches());
            System.out.println("conn.getDoInput() = " + conn.getDoInput());
            System.out.println("conn.getDoOutput() = " + conn.getDoOutput());
            System.out.println("conn.getExpiration() = " + conn.getExpiration());
            System.out.println("conn.getIfModifiedSince() = " + conn.getIfModifiedSince());
            System.out.println("conn.getLastModified() = " + conn.getLastModified());
            System.out.println("conn.getURL() = " + conn.getURL());
            System.out.println("conn.getUseCaches() = " + conn.getUseCaches());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
