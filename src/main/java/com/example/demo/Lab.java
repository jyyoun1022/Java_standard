package com.example.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Lab {
    public static void main(String[] args) {
        String[] strArr = {"dd","aaa","CC","cc","b"};

        // 스트림이 제공하는 연산은 중간 연산 + 최종 연산으로 이루어져 있습니다.
        // 중간 연산은 연산결과를 스트림으로 반환하기 때문에 중간 연산을 연속해서 연결할 수 있다.
        // 하지만 최종 연산은 스트림의 요소를 모하면서 연산을 수행하므로 단 한번만 연산이 가능합니다.

        // 중간 연산 : 연산결과가 스트림인 연산, 스트림에 연속해서 중간연산 가능
        // 최종 연산 : 연산결과가 스트림이 아닌 연산, 스트림의 요소를 소모하므로 단 한번만 가능

        Stream<String> stream = Stream.of(strArr);
//        Stream<String> filteredStream = stream.filter(i-> i.equals(i));//걸러내기
//        Stream<String> distinctedStream = stream.distinct(); //중복제거
//        Stream<String> sortedStream = stream.sorted();  // 정렬
//        Stream<String> limitedStream = stream.limit(5); // 스트림 자르기
//        long total = stream.count();    // 최종 연산 : 여소 개수 자르기

//        stream.sorted().forEach(System.out::print); // 기본정렬
//        stream.sorted(Comparator.naturalOrder()).forEach(System.out::print); //기본정렬
//        stream.sorted((s1,s2)-> s1.compareTo(s2)).forEach(System.out::print); //람다식으로
//        stream.sorted(String::compareTo).forEach(System.out::print);// 위와 동일
//        stream.sorted(Comparator.reverseOrder()).forEach(System.out::print); //역정렬
//        stream.sorted(Comparator.<String>naturalOrder().reversed()).forEach(System.out::print); //위와 가틈
//        stream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::print);// 대소문자 상관없이( + reverse() 추가가능)
        stream.sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::print);//길이순정렬
    }
}
