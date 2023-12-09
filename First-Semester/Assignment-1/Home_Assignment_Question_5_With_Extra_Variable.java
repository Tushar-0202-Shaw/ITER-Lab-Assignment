public class Home_Assignment_Question_5_With_Extra_Variable {
    public static void main(String[] args) {
        int w=1,a=2,k=3,g=4;
        System.out.println("Before swapping value of w : "+w);
        System.out.println("Before swapping value of a : "+a);
        System.out.println("Before swapping value of k : "+k);
        System.out.println("Before swapping value of g : "+g);
        int temp = w;
        w = g;
        g = k;
        k = a;
        a = temp;
        System.out.println("Before swapping value of w : "+w);
        System.out.println("Before swapping value of a : "+a);
        System.out.println("Before swapping value of k : "+k);
        System.out.println("Before swapping value of g : "+g);
    }
}