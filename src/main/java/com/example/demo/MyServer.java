package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
    public static void main(String[] args) {
        BufferedReader in = null;
        PrintWriter out = null;

        ServerSocket serverSocket = null;
        Socket socket = null;
        Scanner sc = new Scanner(System.in);

        try {
            serverSocket = new ServerSocket(8000);
            System.out.println("[Server실행] Client 연결대기중...");
            socket = serverSocket.accept(); //연결대기

            System.out.println("Client 연결됨");
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream());

            while(true) {
                String inputMessage = in.readLine(); //수신데이터 한줄씩 읽기
                if ("quit".equalsIgnoreCase(inputMessage)){
                    break;
                }
                System.out.println("From Client: "+inputMessage);
                System.out.print("전송하기>>> ");

                String outputMessage = sc.nextLine();
                out.println(outputMessage);
                out.flush();
                if("quit".equalsIgnoreCase(outputMessage)) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                sc.close();
                socket.close();
                serverSocket.close();
                System.out.println("연결종료");
            } catch (IOException e) {
                System.out.println("소켓 통신 에러");
            }
        }
    }
}
