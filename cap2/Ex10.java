public class Ex10 {
    public static final void main(String args[]) {
      final short height = 1, weight = 3;
       int zebra = (byte) weight * (byte) height;
       double ox = 1 + height * 2 + weight;
       long giraffe = 1 + 9 % height + 1;

        System.out.println(zebra); // 3
        System.out.println(ox); // 6.0
        System.out.println(giraffe); // 2
    }

    // E
}