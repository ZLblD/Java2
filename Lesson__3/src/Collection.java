import java.util.*;

public class Collection {

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("ArrayList");
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");
        al.add(1, "A0");  // добавление элемента по индексу
        System.out.println(al);
        al.remove("E");
        al.remove(2);
        System.out.println(al);
        System.out.println(al.get(3)); // получить элемент по индеску
        System.out.println(al.set(0, "Z")); // заменить элемент по индеску

        LinkedList<String> ll = new LinkedList<>();
        System.out.println("LinkedList");
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.addFirst("A");       // добавление в начало списка
        ll.addLast("Z");        // добавление в конец списка
        ll.add(1,"A2"); // добавление по индексу в список
        System.out.println("1. LinkedList ll: " + ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println("2. LinkedList ll: " + ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println("3. LinkedList ll: " + ll);
        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println("4. LinkedList ll: " + ll);

        System.out.println("HashSet");
        HashSet<String> hs = new HashSet<>();
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Эта");
        hs.add("Гамма");
        hs.add("Эпсилон");
        hs.add("Омега");
        System.out.println(hs);

        System.out.println("LinkedHashSet");
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Эта");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        lhs.add("Омега");
        System.out.println(lhs);

        System.out.println("TreeSet");
        TreeSet<String> ts = new TreeSet<>();
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        System.out.println(ts);
        System.out.println("HashMap");
        HashMap<String, String> hm = new HashMap<>();
        hm.put("Russia", "Moscow");
        hm.put("France", "Paris");
        hm.put("Germany", "Berlin");
        hm.put("Norway", "Oslo");

        Set<Map.Entry<String, String>> set = hm.entrySet();
        for (Map.Entry<String, String> o : set) {
            System.out.print(o.getKey()+ ": ");
            System.out.println(o.getValue());
        }
        hm.put("Germany", "Berlin2");
        System.out.println("New Germany Entry: " + hm.get("Germany"));






    }
}
