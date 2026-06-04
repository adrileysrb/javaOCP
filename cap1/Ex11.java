import java.lang.*;
import java.lang.System;

public class Ex11 {
    public static void main(String...args) {
        System.out.println("Works!");
    }
}

class Water {}

class Tank {
    public void print(Water water) {
        System.out.println(water);
    }
}
