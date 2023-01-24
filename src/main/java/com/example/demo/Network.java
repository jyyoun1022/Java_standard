package com.example.demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class Network {
    public static void main(String[] args) {
        BufferedReader input =null;
        URL url = null;

        String address = "https://velog.io/@jyyoun1022";
        String line ="";

        try {
            url = new java.net.URL(address);
            line = String.valueOf(new BufferedReader(new InputStreamReader(url.openStream())));

            while((line= input.readLine()) != null) {
                System.out.println(line);
            }
            input.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
