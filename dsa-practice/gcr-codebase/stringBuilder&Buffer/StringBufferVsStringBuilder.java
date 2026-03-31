public class StringBufferVsStringBuilder {
    public static void main(String[] args) {

        int n = 1_000_000;

        long startBuffer = System.nanoTime();

        StringBuffer sbuffer = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sbuffer.append("hello");
        }

        long endBuffer = System.nanoTime();
        long bufferTime = endBuffer - startBuffer;
        long startBuilder = System.nanoTime();

        StringBuilder sbuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sbuilder.append("hello");
        }

        long endBuilder = System.nanoTime();
        long builderTime = endBuilder - startBuilder;
        System.out.println("Time taken by StringBuffer (ns): " + bufferTime);
        System.out.println("Time taken by StringBuilder (ns): " + builderTime);
    }
}
