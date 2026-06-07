public class Ex05 {
    public static final void main(String as[]) {
        new Ex05().printReptile(6);
    }

    void printReptile(int category) {
        var type = switch(category) {
            case 1,2 -> "Snake";
            case 3, 4 -> "Lizard";
            case 5, 6 -> "Turtle";
            case 7, 8 -> "Alligator";
        };
        System.out.print(type);
    }
}

// F