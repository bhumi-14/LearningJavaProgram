package Task;

public class Array_OddEven {
    //Odd and Even Numbers from an Array
    public static void main(String[] args) {
        int[] age={34,56,23,25,87,86,35};

        for (int i = 0; i <age.length ; i++) {
            if(age[i]%2==0){
                System.out.println("age is Even="+age[i]);
            }else {
                System.out.println("age is Odd="+age[i]);
            }
        }
    }
}
