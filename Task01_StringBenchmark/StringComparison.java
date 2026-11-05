public class StringComparison {
    public static void main(String[] args) {
        int count = 10000;
        long start, end;

        start = System.nanoTime();
        String str = "";
        for (int i = 0; i < count; i++) {
            str = str + "Java";
        }
        end = System.nanoTime();
        System.out.println("String time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("Java");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder time: " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buffer.append("Java");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer time: " + (end - start) + " ns");

        System.out.println("Benchmark completed.");
    }
}
