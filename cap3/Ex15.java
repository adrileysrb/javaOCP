import java.util.List;
import java.util.ArrayList;

public class Ex15 {
    public static void main(String ... as) {
        for(var penguin: new int[2])
            System.out.println(penguin);

        System.out.println("-----------");
        
        var ostrich = new Character[3];
        for(var emu : ostrich)
            System.out.println(emu);

        System.out.println("-----------");

        List<Integer> parrots = new ArrayList<Integer>();
        for(var macaw : parrots)
            System.out.println(macaw);

        int[] x = new int[0];
        System.out.println(x.length);

        System.out.println(as.length);
    }
}