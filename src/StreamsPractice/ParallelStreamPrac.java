package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamPrac {

    static class Person{
        String name;
        String city;
        int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, String city, int age){
            this.name = name;
            this.age = age;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", city='" + city + '\'' +
                    ", age=" + age +
                    '}';
        }

    }

    List<Person> peopleList = Arrays.asList(
            new Person("Mahesh","Mira Road",28),
            new Person("Nishi","Panvel",27),
            new Person("papa","Panvel",52),
            new Person("Nidhi","Goregoan",20),
            new Person("Brijesh","Kurla",26),
            new Person("mom","Mira Road",47),
            new Person("misty","Panvel",4),
            new Person("pixie","Mira Road",9));

    public static void main(String[] args){

        //ParallelStream is used to break the stream into smaller steam instance to achieve parallel processing
        ParallelStreamPrac p = new ParallelStreamPrac();

        //using normal Stream
        System.out.println("print persons having age greater than 20 using normal stream");
        p.peopleList.stream().filter(person -> person.age>20).limit(3).forEach(System.out::println);
        System.out.println(" ");

        //using parallel stream
        System.out.println("print persons having age greater than 20 using normal parallel stream");
        p.peopleList.parallelStream().filter(person -> person.age>20).limit(3).forEach(System.out::println);
        System.out.println(" ");

        //convert sequential stream to parallel stream
        System.out.println("print persons having age greater than 20 by converting sequential stream to parallel stream");
        p.peopleList.stream().parallel().filter(person -> person.age>20).limit(3).forEach(System.out::println);
    }
}
