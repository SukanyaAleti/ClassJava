package June06;

public class RotateString {
    public static void main(String[] args){
        String input1 = "JavaJ2eeStrutsHibernate";
        String input2 = "StrutsHibernateJavaJ2ee";
        System.out.println("The rotation of string is : " + CheckStringRotation(input1, input2));
    }
    public static boolean CheckStringRotation(String input1,String input2){
        String input = input1 + input1;
        return input.contains(input2);

    }

} 
