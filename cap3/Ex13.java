public class Ex13 {
    public static void main(String args[]) {

    }

    int getHatSize(Number measurement) {
        return switch(measurement) {
            case Double d -> 1 + d.intValue();
            case null -> 11;
            case Float f when f < 10 -> 4 + f.intValue();
            case Number n -> 3 + n.intValue();
            // case Object a -> 1;
        };
    }
}

// F