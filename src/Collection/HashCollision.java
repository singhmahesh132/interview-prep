package Collection;

import java.util.HashMap;
import java.util.Map;

public class HashCollision {

    public static class MyKey {
        private String name;
        private int id;

        public MyKey(int id, String name) {
            this.id = id;
            this.name = name;
        }


        @Override
        public int hashCode() {
            System.out.println("Calling hashCode()");
            return id;
        }


        @Override
        public boolean equals(Object obj) {
            MyKey key = (MyKey) obj;
            System.out.println("Calling equals() for key: " + obj);
            return this.id == key.id;
            //to avoid hash collision use below code.
            // Since id is(2) same but number value is different for the has collision object
            //i.e. (2,thirdKey)
            //return this.number.equals(key.number);
        }
    }

    public static void main(String[] args){
        HashMap<MyKey, String> map = new HashMap<>();
        MyKey k1 = new MyKey(1, "firstKey");
        MyKey k2 = new MyKey(2, "secondKey");
        MyKey k3 = new MyKey(2, "thirdKey");

        System.out.println("storing value for k1");
        map.put(k1, "firstValue");
        System.out.println("storing value for k2");
        map.put(k2, "secondValue");
        System.out.println("storing value for k3");
        map.put(k3, "thirdValue");

        System.out.println("retrieving value for k1");
        String v1 = map.get(k1);
        System.out.println("retrieving value for k2");
        String v2 = map.get(k2);
        System.out.println("retrieving value for k3");
        String v3 = map.get(k3);
        System.out.println(v1 +" : " + v2 + " : " +v3);

        for(MyKey key : map.keySet()){
                System.out.println(map.get(key));
        }
    }
}
