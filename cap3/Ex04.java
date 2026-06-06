import java.util.*;

public class Ex04 {
    public static void main(String args[]) {
        int[][] a = new int[][] {{1, 2}, {3, 4}};

        for(int x[]: a){
            for(var res: x){
                // System.out.println(res);
            }
        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Small");
        map.put(19, "Ismar");

        for(var aa: map.entrySet()){
            System.out.println(aa.getKey());
        }
    }
}

// A, D, F