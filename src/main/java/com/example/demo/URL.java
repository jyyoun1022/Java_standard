package com.example.demo;

import java.net.MalformedURLException;
import java.net.URISyntaxException;

public class URL {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException {
        java.net.URL url = new java.net.URL("http://www.docehobo.com:80/sample/" +
                "hello.html?refere=codeechobo#index1");

        System.out.println("url.getAuthority() = " + url.getAuthority());
        System.out.println("url.getDefaultPort() = " + url.getDefaultPort());
        System.out.println("url.getPort() = " + url.getPort());
        System.out.println("url.getFile() = " + url.getFile());
        System.out.println("url.getHost() = " + url.getHost());
        System.out.println("url.getPath() = " + url.getPath());
        System.out.println("url.getProtocol() = " + url.getProtocol());
        System.out.println("url.getQuery() = " + url.getQuery());
        System.out.println("url.getRef() = " + url.getRef());
        System.out.println("url.getUserINo = " + url.getUserInfo());
        System.out.println("url.toExternalForm() = " + url.toExternalForm());
        System.out.println("url.toURI() = " + url.toURI());


    }
}
