public class Ex11 {
    enum Animal { BIRD, FISH, MAMMAL }

    public static void main(String args[]) {
        new Ex11().printLocation(Animal.MAMMAL);
    }

    void printLocation(Animal a) {
        long type = switch(a) {
            case BIRD -> 1;
            case FISH -> 2;
            case MAMMAL -> 3;
            default -> 4;
        };
        System.out.print(type);
    }
    
}

// A
