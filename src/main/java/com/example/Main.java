package com.example;

import java.util.Map;

public class Main {
    static void main(String[] args) {
        JavaLambda  javaLambda = new JavaLambda();
        Map<String, String> response = javaLambda.handleRequest(new String[]{"apple", "banana", "orange"});
        System.out.println(response);
    }
}
