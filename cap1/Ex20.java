public class Ex20 {
    String color;
    long age;
    public void Ex20() {
        color = "blue";
        age = 1200;
    }

    public static void main(String []time) {
        var p = new Ex20();
        var q = new Ex20();
        p.color = "green";
        p.age = 1400;
        p = q;
        System.out.println("Q1="+q.color);
        System.out.println("Q2="+q.age);
        System.out.println("P1="+p.color);
        System.out.println("P2="+p.age);
    }

}

// c