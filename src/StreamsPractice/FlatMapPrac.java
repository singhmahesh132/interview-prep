package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class FlatMapPrac {
    List<Integer> numberList1 = Arrays.asList(1,7);
    List<Integer> numberList2 = Arrays.asList(3,9);
    List<Integer> numberList3 = Arrays.asList(4,10);
    List<List<Integer>> listOfIntList = Arrays.asList(numberList1,numberList2,numberList3);

    List<String> namesList1 = Arrays.asList("Nidhi","pixie");
    List<String> namesList2 = Arrays.asList("nishi","mahesh");
    List<String> namesList3 = Arrays.asList("brijesh","hitesh");
    List<List<String>> listOfNamesList = Arrays.asList(namesList1,namesList2,namesList3);

    static class Person{
        String name;
        String city;
        int age;

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", age=" + age +
                    '}';
        }

        public Person(String name, String city, int age){
            this.name = name;
            this.age = age;
            this.city = city;
        }
    }
    List<Person> peopleList1 = Arrays.asList(
            new Person("Mahesh","Mira Road",28),
            new Person("Nishi","Panvel",27));
    List<Person> peopleList2 = Arrays.asList(
            new Person("Nidhi","Goregoan",20),
            new Person("Brijesh","Kurla",26));
    List<Person> peopleLis3 = Arrays.asList(
            new Person("misty","Panvel",4),
            new Person("pixie","Mira Road",9));

    List<List<Person>> listOfPersonList = Arrays.asList(peopleList1,peopleList2,peopleLis3);





    public static void main(String[] args){
        FlatMapPrac p = new FlatMapPrac();

        //Flatmap is used to perform operation on collection when your collection contains collection.
        System.out.println("Printing numbers multiplied by 10");
        p.listOfIntList.stream().flatMap(numList->numList.stream().map(num -> num*10)).forEach(System.out::println);
        System.out.println(" ");

        System.out.println("Printing names in uppercase");
        p.listOfNamesList.stream().flatMap(namesList-> namesList.stream().map(String::toUpperCase)).forEach(System.out::println);
        System.out.println(" ");

        System.out.println("Print person with name to uppercase and age < 25");
       /* p.listOfPersonList.stream().flatMap(personList -> personList.stream().map(person -> {person.name = person.name.toUpperCase();
                                                                                                return person;}
                                                                                    ).filter(person -> person.age<25)).forEach(System.out::println);*/
        p.listOfPersonList.stream().flatMap(
                personList -> personList.stream().
                        peek(person -> person.name = person.name.toUpperCase()).filter(person -> person.age<25)
                                             ).forEach(System.out::println);
    }
}
