package June06;



import java.util.Arrays;
public class AnagramString {
    public static void main(String[] args) {
        String str1 = "State";
        String str2 = "Taste";
        if (CheckAnagram(str1, str2)) {
             System.out.println("Two strings are Anagrams.");
        } else {
             System.out.println("Two strings are not Anagrams.");
        }

    }
    public static boolean CheckAnagram(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        else {
            String x1 = str1.toLowerCase();
            String x2 = str2.toLowerCase();
            char[] s1 = x1.toCharArray();
            char[] s2 = x2.toCharArray();
            Arrays.sort(s1);
            Arrays.sort(s2);
            return Arrays.equals(s1,s2);
        }

    }
}



