public class Ex19 {
    static final public void main(String... args) {
        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte)(Byte.MAX_VALUE + 1);
        System.out.println(start);
        System.out.println(end);

        System.out.println(end);
    }
}

// B, F