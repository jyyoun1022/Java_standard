package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class 함수형_인터페이스 {
    public static void main(String[] args) {

        // Supplier<T> -> 매개변수는 없고, 리턴값만 존재함 (공급만)
        // Consumer<T> -> 매개변수만 있고, 리턴값이 없으 (수요만)
        // Function<T,R> -> 일반적인 함수, 하나의 매개변수를 받아서 결과를 반환
        // Predicate<T> -> 조건식을 표현하는데 사용함 매개변수는 하나, 반환 타입은 boolean
        Supplier<Integer> s =() ->(int) (Math.random() * 100) + 1;
        Consumer<Integer> c = i -> System.out.print(i+",");
        Predicate<Integer> p = i -> i%2 ==0;
        Function<Integer,Integer> f = i -> i/10 *10; // 1의 자리를 없앨때

        List<Integer> list = new ArrayList<>();
        makeRandomList(s,list);
        System.out.println(list);
        printEvenNum(p,c,list);
        List<Integer> newList = doSomething(f, list);
        System.out.println(newList);


    }

    static <T> List<T> doSomething (Function<T,T> f, List<T> list){
        List<T> newList = new ArrayList<>(list.size());

        for (T t : newList) {
            newList.add(f.apply(t));
        }
        return newList;
    }

    static <T> void printEvenNum(Predicate<T> p , Consumer<T> c, List<T>list) {
        System.out.print("[");
        for (T i : list) {
            if(p.test(i)){
                c.accept(i);
            }
        }
        System.out.println("]");
    }

    static <T> void makeRandomList(Supplier<T> s, List<T> list) {
        for(int i=0; i<10; i++){
            list.add(s.get());
        }
    }
}

