public class Question_8 {
    public static void main(String[] args) {
        int x=5;
        int y=6;
        System.out.println("Before swapping value of x : "+x);
        System.out.println("Before swapping value of y : "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping value of x : "+x);
        System.out.println("After swapping value of y : "+y);
    }
}