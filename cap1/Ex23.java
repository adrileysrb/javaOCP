public class Ex23 {
    int Depth = 1;
    float temp = 50.0;
    public void flow() {
        for(int i = 0; i < 1; i++) {
            int depth = 2;
            depth++;
            temp--;
        }
        System.out.println(depth);
        System.out.println(temp);
    }
    public static final void main() {
        new Ex23().flow();
    }
}

// a, d