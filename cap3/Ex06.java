import java.util.List;
import java.util.ArrayList;

public class Ex06 {
    public static void main(String ... sa){
        List<Integer> myFavoriteNumbers = new ArrayList<>();
        myFavoriteNumbers.add(10);
        myFavoriteNumbers.add(14);
        for(var a: myFavoriteNumbers) {
            System.out.print(a + ", ");
            break;
        }

        System.out.println();

        for (int b: myFavoriteNumbers) {
            System.out.print(b + ", ");
            continue;
        }
        
        System.out.println();

        for(Object c : myFavoriteNumbers)
            System.out.print(c + ", ");
    }
}

// E