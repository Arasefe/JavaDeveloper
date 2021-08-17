package day33_Collections.mapPackage;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class HashMap01 {
    public static void main(String[] args) {
        String str = "Java is easy. Type codes to learn Java. To learn more Java, code more in Java.";
        countOfOccurrences(str);
        stringFrequency1(str);
    }

    private static void countOfOccurrences(String str) {
        str = str.replaceAll("\\p{Punct}", "");
        System.out.println(str);

        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));

        HashMap<String, Integer> result = new HashMap<>();

        for (String each : words) {
            Integer numOfValues = result.get(each);
            if (numOfValues == null) {
                result.put(each, 1);
            } else {
                result.put(each, numOfValues + 1);
            }
        }
        System.out.println(result);
    }


        public static void stringFrequency1 (String str){
            str = str.replaceAll("\\p{Punct}", " ");
            HashMap<String, Integer> map = new LinkedHashMap<>();
            String[] arr = str.split(" ");
            for (String each : arr) {
                if (!map.containsKey(each)) {
                    map.put(each, 1);
                } else if (map.containsKey(each)) {
                    map.put(each, map.get(each) + 1);
                }
            }
            System.out.println(map);
        }
    }

