package Task;

public class MaxNum {
    //Take a user input 2 numbers from the arguments and
    // calculate the maximum in between with the ternary operator.
    public static void main(String[] args) {
        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=Integer.parseInt(args[2]);
        int d=Integer.parseInt(args[3]);
        int max = (a > b) ? a : b;
        System.out.println(max);
        int min = (c<d) ? c : d ;
        System.out.println(min);

    }
}
