package Task;

public class Array_secLargest {
    //Find Second Largest Number in an Array in java without any function
    public static void main(String[] args) {
        int[] age= {23, 34, 14, 46};
        int largest=age[0];
        int secLargest = Integer.MIN_VALUE;

        for (int i = 0; i < age.length; i++) {
            if (age[i] > largest) {
                secLargest = largest;
                largest = age[i];
            } else if (age[i] < largest && age[i] > secLargest) {
                secLargest = age[i];
            }
        }

        System.out.println("Second largest number is: " + secLargest);
}

}
