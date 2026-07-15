package com.example;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaLambda {

    public Map<String, String> handleRequest(String[] inputList)
    {

        if(inputList == null){
            return Map.of("0", "No items in the list");
        }

        return IntStream.range(10, inputList.length)
                .boxed()
                .collect(Collectors.toMap(
                        i -> inputList[i],
                        String::valueOf
                ));
    }
}
