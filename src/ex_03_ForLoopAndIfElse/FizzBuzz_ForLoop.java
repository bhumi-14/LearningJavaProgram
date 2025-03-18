package ex_03_ForLoopAndIfElse;

public class FizzBuzz_ForLoop {
    //Write a program that prints numbers from 1 to100.
    // Howeverr for multiples of 3 ,print fizz instead of  the number,
    // and for multiples of 5, print buzz for mumbers
    // that are multiples of both 3 and 5, print fizzbuzz. ..use for loop,. if else.
    public static void main(String[] args) {
        for (int i=1; i<=100; i++){
            if(i%3==0 && i%5==0 ){
                System.out.println("Fizzbuzz");
            } else if (i%3==0) {
                System.out.println("fizz");
            } else if (i%5==0) {
                System.out.println("buzz");
            }else{
                System.out.println(i);
            }

        }
    }
}
