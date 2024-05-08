package src.Programs;/* Write a program to pint an array in increasing order of frequency o number, and is frequency is
 same the print the number in descending order */
import java.util.*;

public class MyFreqSortProgram {

    public static class numObj{
        int num;
        int freq;

        public numObj(int num, int freq){
            this.num = num;
            this.freq = freq;
        }
    }
    public Map<Integer, Integer> getFreqMap(List<Integer> numList){
        Map<Integer,Integer> freqMap = new HashMap<>();
        for(int num : numList){
            freqMap.put(num, freqMap.getOrDefault(num,0)+1);
        }
        return freqMap;
    }

    static class myComparator implements Comparator<numObj>{
        public int compare(numObj o1, numObj o2){
            int count = Integer.compare(o2.freq,o1.freq);
            return count == 0 ? Integer.compare(o2.num, o1.num) : count;
        }
    }
    public List<numObj> getSortedList(Map<Integer,Integer> freqMap){
       List<Integer> numList = freqMap.keySet().stream().toList();
       List<numObj> mapToList = new ArrayList<>();
       for(int num : numList){
           mapToList.add(new numObj(num,freqMap.get(num)));
       }
       mapToList = mapToList.stream().sorted(new myComparator()).toList();
       return mapToList;
    }

    public void printList(List<numObj> list){
        for(numObj obj : list ){
            for(int i = 0; i < obj.freq; i++){
                System.out.print(obj.num+" ");
            }
        }
    }

    public static void main(String[] args){
        MyFreqSortProgram program = new MyFreqSortProgram();
        Integer[] arr = {1,1,1,2,2,2,2,3,3,3,4,5,5};
        Map<Integer,Integer> freqMap = program.getFreqMap(Arrays.stream(arr).toList());
        List<numObj> sortedList = program.getSortedList(freqMap);
        program.printList(sortedList);
    }
}
