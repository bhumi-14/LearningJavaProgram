package Task;

public class Stringbuffer_Functions {
    public static void main(String[] args) {

        //1. Creating a StringBuffer
        StringBuffer sb = new StringBuffer("Bhuaneshari");
        System.out.println(sb);
        //2. append(String s): Adds text at the end
        System.out.println(sb.append(" Kh0bragade"));
    //3. insert(int index, String s): Inserts text at a given position
        System.out.println(sb.insert(3,"w"));
        //4. replace(int start, int end, String s): Replaces a substring
        System.out.println(sb.replace(13,24,"Patil" ));
        //5. delete(int start, int end): Deletes a substring
        System.out.println(sb.delete(5, 12));
        //6. reverse(): Reverses the string
        System.out.println(sb.reverse());
        //7. capacity(): Returns the capacity of the buffer
        System.out.println(sb.capacity());
        //8. ensureCapacity(int minCapacity): Ensures a minimum capacity
        sb.ensureCapacity(12);
        System.out.println(sb.capacity());
        //9. charAt(int index): Returns a character at a specified index
        System.out.println(sb.charAt(3));
        //10. setCharAt(int index, char ch): Changes a character at a position
        sb.setCharAt(3, 'A');
        System.out.println(sb);
        //11. length(): Returns the length of the buffer
        System.out.println(sb.length());
        //12. substring(int start): Extracts a substring
        System.out.println(sb.substring(5));
        //13. substring(int start, int end): Extracts a substring within a range
        System.out.println(sb.substring(0, 4));
        //14. toString(): Converts StringBuffer to String
        System.out.println(sb.reverse());
        System.out.println(sb.toString());
        //15. trimToSize(): Reduces capacity to fit the current content
        sb.trimToSize();
        System.out.println(sb.capacity());
    }
}