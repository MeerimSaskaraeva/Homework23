import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortImpl implements Sort{
    @Override
    public int[] sortArray(int[] array) {
        Arrays.sort(array);

        return array;
    }

    @Override
    public List<Integer> sortArrayList(List<Integer> array) {
        Collections.sort(array);
        return array;
    }

    @Override
    public List<Integer> sortLinkedList(List<Integer> array) {
        Collections.sort(array);
        return array;
    }
}
