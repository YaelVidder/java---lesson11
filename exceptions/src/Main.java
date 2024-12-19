import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Main {
    static void y() {
        x();
    }

    static void x() {
        y();
    }

    public static void main(String[] args) {

        List<Integer> list = null;
        //list.add(1);

        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //list.get(3);

        //HashSet<Integer> set = (HashSet<Integer>) list;

        //Float.parseFloat("456.7m");

//        x();

        int x = 7;
//        System.out.println(x / 0);

        int[] arr1 = {1, 2, 3, 4, 5};
        float[] arr2 = {1, 2, 3, 4, 5};
        // System.arraycopy(arr1, 0, arr2, 0, arr1.length);

        // LocalDate date = LocalDate.of(5000,15,46);

    }
}