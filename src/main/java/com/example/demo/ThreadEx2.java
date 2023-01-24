package com.example.demo;

import javax.swing.*;

public class ThreadEx2 {
    public static void main(String[] args) {
        ThreadEx7 t = new ThreadEx7();
        t.start();

        String input = JOptionPane.showInputDialog("아무값이나 입력하세요.");
        System.out.println("입라신값은 "+input+"입니다.");
    }
}
class ThreadEx7 extends Thread {
    @Override
    public void run() {
        for(int i=10; i>0; i--){
            System.out.println(i);
            try{
                sleep(1000);
            } catch (Exception e){

            }
        }

    }
}

