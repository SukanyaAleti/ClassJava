package StaticConcept;

public class UserManager {
        private static int userCount;

        public static int getUserCount() {
            return userCount;
        }

        static {
             userCount = 0;
        }
        public static void addUser() {
            userCount++;
        }
    }

