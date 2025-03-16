package Task;

public class Even_Odd_ifLoop {
    //Create a Program - Take user input & Check weather the input is even or odd number
    public static void main(String[] args) {
        //String a=args[0];
 int a=Integer.parseInt(args[0]);
        if (a%2==0) {
            System.out.println("a is even");
        }else {
            System.out.println("a is odd");
        }
    }

}
