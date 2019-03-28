package exercisesany.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Colectii {

    public static void doTiminngs(String type, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }
        long start = System.currentTimeMillis();
        //add end list
         /*for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }*/

         //add intermediate list
        /*for (int i = 0; i < 1E5; i++) {
            list.add(100,i);
        }*/

        //add begin list
        for (int i = 0; i < 1E5; i++) {
            list.add(0, i);
        }

        long end = System.currentTimeMillis();
        System.out.println("time taken: " + (end - start) + " ms for " + type);
    }

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        doTiminngs("Arraylist", arrayList);
        doTiminngs("LinkedList", linkedList);


    }


}
