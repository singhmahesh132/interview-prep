package src.StreamsPractice;

import java.util.*;

public class OtherStreamMethods {

    //Non-Terminal Methods : filter(),map(),flatMap(),distinct(),limit(),sorted()
    //Terminal Methods : collect(Collectors.toList()),count(),min(),max(),forEach(),toArray()
    List<String> strList = Arrays.asList("Mahesh","Nishi","Mahesh","Nishi",null,"Brijesh");
    List<Integer> numberList = Arrays.asList(1,3,50,60,69,4,2,100,45,5,6,7);

    public static void main(String[] args){
        OtherStreamMethods p = new OtherStreamMethods();

        //distinct()
        System.out.println("filtering not null and printing distinct names");
        p.strList.stream().filter(Objects::nonNull).distinct().forEach(System.out::println);

        //count()
        long count = p.strList.stream().filter(Objects::nonNull).count();
        System.out.println("count after removing null values : "+count);

        //limit()
        System.out.println(" ");
        System.out.println("printing just first two names using limit");
        p.strList.stream().limit(2).forEach(System.out::println);

        //min(),max()
        //returns Optional object
        System.out.println(" ");
        //Comparator.naturalOrder() wil sort in min to max order, and Comparator.reverseOrder() will sort in max to min order
        //here we can use max(Comparator.naturalOrder()), it will sort in ascending order and max will return last variable
        //Optional<String> min = p.strList.stream().filter(Objects::nonNull).min((n1, n2)-> n2.compareTo(n1));
        Optional<Integer> min = p.numberList.stream().filter(Objects::nonNull).min(Comparator.naturalOrder());
        System.out.println("printing using min and naturalOrder() : "+min.get());
        Optional<Integer> minUsingMax = p.numberList.stream().filter(Objects::nonNull).max(Comparator.reverseOrder());
        System.out.println("printing using max and reverseOrder() : "+ minUsingMax.get());
        System.out.println(" ");

        //reduce()
        //it will reduce all the elements in collection to one.
        //returns Optional object
        Optional<String> combinedString = p.strList.stream().filter(Objects::nonNull).reduce((value,acc) -> value+acc);
        System.out.println("combining all names and printing using reduce() : "+ minUsingMax.get());
        System.out.println(combinedString.get());
        System.out.println(" ");

        //Sorted()
        //it will naturally sort in ascending order
        System.out.println("printing numlist in ascending order : ");
        p.numberList.stream().sorted().forEach(num -> System.out.print(" "+num));
        System.out.println(" ");
        System.out.println("printing numlist in descending sorted  : ");
        p.numberList.stream().sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(" "+num));

        System.out.println("printing strlist in ascending order : ");
        p.strList.stream().filter(Objects::nonNull).sorted().forEach(num -> System.out.print(" "+num));
        System.out.println(" ");
        System.out.println("printing strlist in descending sorted  : ");
        p.strList.stream().filter(Objects::nonNull).sorted(Comparator.reverseOrder()).forEach(num -> System.out.print(" "+num));
        System.out.println(" ");

        //anyMatch(),allMatch(),noneMatch()
        //returns boolean
        System.out.println(" ");
        System.out.println(p.numberList.stream().anyMatch(value -> value == 100));
        System.out.println(p.numberList.stream().allMatch(value -> value == 100));
        System.out.println(p.numberList.stream().noneMatch(value -> value == 0));
        System.out.println(" ");

        //findAny(),findFirst()
        //returns Optional Object
        //will return NoSuchElementException in stream is empty
        Optional<Integer> any = p.numberList.stream().findAny();
        System.out.println(any.get());
        Optional<Integer> first = p.numberList.stream().findFirst();
        System.out.println(first.get());

    }
}
