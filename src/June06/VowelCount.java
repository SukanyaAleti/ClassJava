package June06;

public class VowelCount {
        public static void main(String[] args){
            String s11 = "Aleti";
            System.out.println("VowelCount in a string is : " + Vcount(s11));
        }
        public static int Vcount(String s11){
            int vCount= 0;
            for(int i = 0; i<s11.length();i++){
                char x = s11.charAt(i);
                 if(x=='A'|| x=='E'|| x=='I'|| x=='O'|| x=='U'|| x=='a'|| x=='e'|| x=='i'|| x=='o'|| x =='u'){
                    vCount++;
                }
            }
            return vCount;
        }
}


