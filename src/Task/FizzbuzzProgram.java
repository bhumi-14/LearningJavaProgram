package Task;

public class FizzbuzzProgram {
    //Write a program that prints numbers from 1 to100.
    // However for multiples of 3 ,print fizz instead of  the number,
    // and for multiples of 5, print buzz for mumbers
    // that are multiples of both 3 and 5, print fizzbuzz. ..use for loop,. if else.
    public static void main(String[] args) {
        for (int i=1; i<=100;i++){
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz  "+i);
            } else if (i%3==0) {
                System.out.println("fizz  "+i);
            }else if(i%5==0){
                System.out.println("buzz  "+i);
            }
        }
    }
}
