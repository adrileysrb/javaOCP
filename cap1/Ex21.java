public class Ex21 {
    int count;
    {System.out.print(count+"-");}
    {count++;}
    public Ex21() {
        count = 4;
        System.out.print(2+"-");
    }
    public static void main(String[] args) {
        System.out.print(7+"-");
        var s = new Ex21();
        System.out.print(s.count+"-");
    }
}

// d