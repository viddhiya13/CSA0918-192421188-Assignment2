import java.util.ArrayList;
import java.util.LinkedList;

public class PlaylistBenchmark {
    public static void main(String[] args) {
        int size = 10000;
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        long start, end;

        start = System.nanoTime();
        for (int i = 0; i < size; i++) arrayList.add("Song " + i);
        end = System.nanoTime();
        System.out.println("ArrayList insertion: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) linkedList.add("Song " + i);
        end = System.nanoTime();
        System.out.println("LinkedList insertion: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) arrayList.get(i);
        end = System.nanoTime();
        System.out.println("ArrayList indexed access: " + (end - start) + " ns");

        start = System.nanoTime();
        for (int i = 0; i < size; i++) linkedList.get(i);
        end = System.nanoTime();
        System.out.println("LinkedList indexed access: " + (end - start) + " ns");

        System.out.println("Comparison completed.");
    }
}
