public class Ex05 {
    private Ex05 pandaBear;
    private void roar(Ex05 b){
        System.out.println("Roar!");
        pandaBear = b;
    }

    public static void main(String[] args) {
        Ex05 brownBear = new Ex05();
        Ex05 polarBear = new Ex05();
        brownBear.roar(polarBear);
        polarBear = null;
        brownBear = null;
        System.gc(); 
    }

    // S    A. The object created on line 9 is first eligible for garbage
    // collection after line 13.
    // X    B. The object created on line 9 is first eligible for garbage
    // collection after line 14.
    // X   C. The object created on line 10 is first eligible for garbage
    // collection after line 12.
    // S   D. The object created on line 10 is first eligible for garbage
    // collection after line 13.
    // X    E. Garbage collection is guaranteed to run.
    // S    F. Garbage collection might or might not run.
    // X    G. The code does not compile.

}
