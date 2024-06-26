package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class MapPrac {

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

    List<Integer> numberList = Arrays.asList(1,3,4,2,5,6,7);
    List<String> strList = Arrays.asList("Mahesh",null,"Nidhi","Nishi",null,"Brijesh");
    List<Person> peopleList = Arrays.asList(
            new Person("Mahesh","Mira Road",28),
            new Person("Nishi","Panvel",27),
            new Person("Nidhi","Goregoan",20),
            new Person("Brijesh","Kurla",27),
            new Person("Pixie","Mira Road",9));

    public static void main(String[] args){
        MapPrac m = new MapPrac();

        //Map Method : takes consumer as input i.e. just consumes the value passed in method
        //Map method return only single value.

        //List<Integer> doubleNumList = m.numberList.stream().map(n-> n*2).collect(Collectors.toList());
        List<Integer> doubleNumList = m.numberList.stream().map(n-> n*2).toList();
        System.out.println("---> print numberList * 2 values");
        m.numberList.stream().map(num -> num*2).forEach(num -> System.out.print(num+":"));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("---> printing sorted numberlist");
        m.numberList.stream().sorted().forEach(num -> System.out.print(num+":"));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("---> printing strList in uppercase after removing null");
        //m.strList.stream().map(name -> name.toUpperCase()).forEach(name -> System.out.println(name+" "));
        m.strList.stream().filter(Objects::nonNull).map(String::toUpperCase).forEach(name -> System.out.print(name+":"));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("---> printing people.city list by making city to Uppercase");
        m.peopleList.stream().map(p -> p.city.toUpperCase()).toList().forEach(name -> System.out.print(name+":"));
        System.out.println(" ");

        System.out.println(" ");
        System.out.println("---> printing entire people object list by making name to Uppercase");
        /* m.peopleList.stream().map(person ->{person.name = person.name.toUpperCase();
                                                return person;}
                                    ).toList().forEach(System.out::println); */
        //Streams introduced peek(), and peek returns the entire object of the value on which map operation is performed,
        // whereas map returned just the value
        m.peopleList.stream().peek(person -> person.name = person.name.toUpperCase()).toList().forEach(System.out::println);
    }
}
