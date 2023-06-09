package June06;

/* public class ReverseWord {
   public static void main(String[] args){
        String a ="Java J2EE Reverse Me";
        System.out.println("The reverse word in a sentence is : " + a  );
    }
    public static String ReverseWord(String a){
        int r = 0;
        for(int i = 0; i < a.length(); i++){
          char c = a.charAt(i);
          if(c)
        }
    }*/
 public class ReverseWord {
    public static void main(String[] args) {
        String sentence = "Java J2EE Reverse Me";
        System.out.println("The reverse each word in a sentence : " + ReverseWord(sentence));
    }
    public static String ReverseWord(String sentence) {
        String[] a = sentence.split(" ");
        String newStr = "";
        int i = 0;
        while (i < a.length) {
            String w1 = a[i];
            String newWord = " ";
            for (int j = w1.length()-1; j >= 0; j--)
            {
                newWord += w1.charAt(j);
            }
            newStr += newWord + " ";
            i++;
        }
        return newStr;
    }

 }


