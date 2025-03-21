package Task;

public class RevString {
    public static void main(String[] args) {
    String str=new String("Aarna");
    String name=str.toLowerCase();
    String revStr="";

    for (int i=name.length()-1; i>=0;i--){
        char c=name.charAt(i);
         revStr=revStr+c;
        }
        System.out.println(revStr);
        if (revStr.equals(name)){
            System.out.println("is Palindrome");
   }
        else {
            System.out.println("is not palindrome");
        }


    }



}
