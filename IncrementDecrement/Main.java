public class Main {
    public static void main(String[] args) {
        int x = 50;
        // ++x;  x = x + 1
        // x++ post increment, ++x pre increment, x-- post decrement, --x pre decrement

        // post increment
        // int y = x++;
        // System.out.println("X: " + x);
        // System.out.println("Y: " + y);

        // pre increment
        // int y = ++x;
        // System.out.println("X: " + x);
        // System.out.println("Y: " + y);

        // post decrement
        // int y = x--;
        // System.out.println("X: " + x);
        // System.out.println("Y: " + y);

        // pre decrement
        int y = --x;
        System.out.println("X: " + x);
        System.out.println("Y: " + y);
    }
}
