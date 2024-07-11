package src.Programs;

/* Write a program to pint an array in increasing order of frequency of number, and if frequency is
 same then print the number in descending order */

import java.util.*;

public class    FreqSortUsingStreams {

    public static void main(String[] args){

        Integer[] arr = {1,1,1,2,2,2,2,3,3,3,4,5,5};
        List<Integer> arrToList = Arrays.stream(arr).toList();

        Map<Integer,Integer> freqMap = new HashMap<>();

        arrToList.forEach(num -> freqMap.put(num, freqMap.getOrDefault(num,0)+1));

        freqMap.entrySet().stream().sorted((o1, o2) ->
                o2.getValue().compareTo(o1.getValue()) == 0 ? o2.getKey().compareTo(o1.getKey()) : o2.getValue().compareTo(o1.getValue())
        ).forEach(entry -> {
            for(int i = 0; i < entry.getValue(); i++)
                System.out.print(entry.getKey()+" ");
        });

    }
}