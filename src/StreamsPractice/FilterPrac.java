package src.StreamsPractice;

import java.util.Arrays;
import java.util.List;

public class FilterPrac {
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
    List<String> strList = Arrays.asList("Mahesh",null,"nidhi","nishi",null,"brijesh");
    List<Person> peopleList = Arrays.asList(new Person("Mahesh","Mira Road",28),
                                            new Person("Nishi","Panvel",27),
                                            new Person("Nidhi","Goregoan",20),
                                            new Person("Brijesh","Kurla",27),
                                            new Person("pixie","Mira Road",9));



    public static void main(String[] args){
        FilterPrac flt = new FilterPrac();

        //Filter Method : take predicate as input i.e. returns boolean value

        //List<Integer> evenList = flt.numberList.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        List<Integer> evenList = flt.numberList.stream().filter(num -> num % 2 == 0).sorted().toList();
        System.out.println("SortedEvenNum List");
        //evenList.stream().forEach(System.out :: println);
        evenList.forEach(System.out :: print);

        List<String> notNullNamesList = flt.strList.stream().filter(name -> name != null && name.length()<6).toList();
        System.out.println(" ");
        System.out.println("NotNullNames List");
        notNullNamesList.forEach(System.out :: println);

        System.out.println(" ");
        System.out.println("person with age less than 25");
        flt.peopleList.stream().filter(p -> p.age<25).forEach(System.out :: println);
    }
}
