

import java.util.*;

 class DZ {
    public static void main(String[] args) {

        task1();

        task2();

    }

     static void task1() {
        String[] string = {"dog", "cat", "car", "dog", "sea", "cat", "car", "dog", "sea", "car",};
        Set<String> set = new HashSet<>(Arrays.asList(string));
        System.out.println(set);

        Map<String, Integer> map = new HashMap<>();
        for (String s : string) {
            if(!map.containsKey(s)){
                map.put(s,0);
            }
            map.put(s, map.get(s)+1);
        }
        System.out.println(map);
    }


     static void task2() {
         PhoneBook contackt = new PhoneBook();

         contackt.add("Petrov", "92611111");
         contackt.add("Petrov", "92622222");
         contackt.add("Sidorov", "92633333");
         contackt.add("Ivanov", "92644444");

         System.out.println(contackt.get("Petrov"));
     }


}