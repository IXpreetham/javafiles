import java.util.*;

public class prog2 {
    public static void main(String args[]) {

        String[] arr = {"Preetham", "Sushanth", "jai", "Preetham"};


        System.out.println("After converting into ArrayList:");
        ArrayList<String> arr1 = new ArrayList<>();
        for (String i : arr) {
            arr1.add(i);
        }
        System.out.println(arr1);


        HashSet<String> arr2 = new HashSet<>();
        for (String i : arr) {
            arr2.add(i);
        }
        System.out.println("\nHashSet:");
        System.out.println(arr2);

        HashMap<String, Integer> arr3 = new HashMap<>();
        for (String i : arr) {
            if (arr3.containsKey(i)) {
                arr3.put(i, arr3.get(i) + 1);
            } else {
                arr3.put(i, 1);
            }
        }

        System.out.println("\nHashMap:");
        System.out.println(arr3);

        System.out.println("\nArrayList using for-each:");
        for (String s : arr1) {
            System.out.println(s);
        }
        System.out.println("\nHashSet using Iterator:");
        
        Iterator<String> it = arr2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("\nHashMap using entrySet:");
        for (Map.Entry<String, Integer> entry : arr3.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
        System.out.println("\nHashMap using keySet:");
        for (String key : arr3.keySet()) {
            System.out.println(key + " - " + arr3.get(key));
        }
        System.out.println("\nHashMap using forEach():");
        arr3.forEach((k, v) -> System.out.println(k + " - " + v));
    }
}
