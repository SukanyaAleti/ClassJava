public class PersonAge {
        public static void main(String[] args) {
            int age = 19;
            AgeCategory(age);
        }

            public static void AgeCategory(int age){

            if (age < 13) {
                System.out.println("Kid");
            } else if (age >= 13 && age <= 19) {
                System.out.println("Teen");
            } else{
                System.out.println("Adult");
            }
        }
    }


