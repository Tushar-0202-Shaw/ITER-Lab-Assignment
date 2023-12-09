public class Question_7 {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        System.out.println("Before swapping value of x : "+x);
        System.out.println("Before swapping value of y : "+y);
        int z = x;
        x=y;
        y=z;
        System.out.println("After swapping value of x : "+x);
        System.out.println("After swapping value of y : "+y);
    }
}