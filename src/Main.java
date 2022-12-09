import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        SortImpl sort = new SortImpl();

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        int[] array1 = new int[10];
        for (int i = 0; i < array1.length; i++) {
            array1[i]= random.nextInt(0,2);
        }


        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(0, 2));
        }
        for (int i = 0; i < 10; i++) {
            linkedList.add(random.nextInt(0, 2));
        }

        System.out.println(Arrays.toString(sort.sortArray(array1)));
        System.out.println(sort.sortArrayList(arrayList));
        System.out.println(sort.sortLinkedList(linkedList));
    }
}