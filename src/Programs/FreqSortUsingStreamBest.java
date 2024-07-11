package src.Programs;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FreqSortUsingStreamBest {

    public static void main(String[] args){

        Integer[] arr = {1,1,1,2,2,2,2,3,3,3,4,5,5};
        Arrays.stream(arr).collect(Collectors.groupingBy(Integer::intValue,Collectors.counting()))
                .entrySet().stream().sorted((o1,o2) ->
                        o2.getValue().compareTo(o1.getValue()) == 0 ?
                                o2.getKey().compareTo(o1.getKey()) : o2.getValue().compareTo(o1.getValue()))
                .forEach(entry -> {
                    for(int i = 0; i < entry.getValue(); i++)
                        System.out.print(entry.getKey()+" ");
                });
    }
}
