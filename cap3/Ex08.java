public class Ex08 {
    public static void main(String args[]) {
        new Ex08().printType(1);

        if(null instanceof Object) {
            System.out.println("Java");
        }
    }

    void printType(Object o) {
        if(o instanceof Integer bat) {
            System.out.print("int");
        } else if (o instanceof Integer bat && bat < 10) {
            System.out.println("small int");
        } else if(o instanceof Long bat && bat <= 20) {
            System.out.print("long");
        } else {
            System.out.print("unknown");
        }
    }
}

// G