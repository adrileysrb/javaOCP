public class Ex02 {
    final public static void main(String [] aa) {
        Object valor = 9;
        switch(valor) {
            case Integer a when a >= 9 -> System.out.println("Estou ficando bom nisso");
            default -> System.out.println("Default");
        }
    }
}

// a, b, c