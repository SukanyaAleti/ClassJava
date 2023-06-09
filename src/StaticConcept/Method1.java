package StaticConcept;

public class Method1 {
        public static void main(String[] args) {
            UserManager.addUser();
            UserManager.addUser();
            UserManager.addUser();
            int count = UserManager.getUserCount();
             System.out.println("Current user count: " + count);
        }
    }

