package June12;

public class ConvertorStrtoInt {
    public static void ConversionException(String x){
       try {
           int input = Integer.parseInt(x);
        System.out.println("Converted input : " +input );

    }catch(NumberFormatException e) {
           System.out.println("Exception: " + e.getMessage());
       }
    }
    public static void main(String[] args){
        ConversionException("12");
        ConversionException("212d");
        ConversionException("Sukanya");
        ConversionException("as2e22");


    }

}
