package Task;

public class StringFunctions {
    public static void main(String[] args) {
        // Common String Methods
//        length()charAt(index)  substring(start, end)   contains(str) indexOf(str)
//        lastIndexOf(str)toUpperCase()toLowerCase() trim()replace(old, new) split(regex)
//        equals(str) equalsIgnoreCase(str)    startsWith(prefix)  endsWith(suffix)  isEmpty()
//        join(delimiter, elements...
        String str1= new String("Bhuwaneshwari");
        String str2= new String("Amol Patil");
        //length()
        System.out.println(str1.length());
        //charAt(index)
        System.out.println(str1.charAt(3));
        System.out.println(str2.charAt(3));
        //substring(start, end)
        System.out.println(str2.substring(4,8));
        //contains(str)
        System.out.println(str2.contains("a"));
        System.out.println(str2.contains("A"));
        //indexOf(str)
        System.out.println(str2.indexOf("g"));
        System.out.println(str2.indexOf("A"));
        //lastIndexOf(str)/
        System.out.println(str2.lastIndexOf("Patil"));
        //toUpperCase()
        System.out.println(str2.toUpperCase());
        //toLowerCase()
        System.out.println(str1.toLowerCase());
        //trim()
        String str3=new String(" Aarna  ");
        System.out.println(str3.trim());
        //replace(old, new)
        System.out.println(str2.replace("A", "a"));
        //split(regex)
        String  str4= new String("abc&acccd&hjfgh");
        System.out.println(str4.split("&"));
        //equals(str)
        System.out.println(str4.equals(str1));
        //equalsIgnoreCase(str)
        String str5= new String("bhuWaneShwari");
        System.out.println(str5.equalsIgnoreCase(str1));
        //startsWith(prefix)
        System.out.println(str1.startsWith("a"));
        //endsWith(suffix)
        System.out.println(str2.endsWith("l"));
        //isEmpty()
        System.out.println(str2.isEmpty());
        //join(delimiter, elements...
        System.out.println(String.join(str1, str2));

    }
}
