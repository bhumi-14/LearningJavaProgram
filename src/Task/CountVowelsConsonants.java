package Task;

public class CountVowelsConsonants {
    //count vowels and consonant in Bhuwaneshwari by using for loop
    public static void main(String[] args) {
        String str=new String("Aarna Patil");
        String name=str.toLowerCase();
        int vowelcount=0;
        int consonantCount=0;
        for (int i=0; i<str.length();i++){
            char cr=name.charAt(i);
            if(cr=='a' || cr=='e' || cr=='i' || cr=='o' || cr=='u'){

                vowelcount++;
            }else{

                consonantCount++;
            }
        }
        System.out.println("is vowel "+vowelcount);
        System.out.println("is consonant "+consonantCount);
    }
}
