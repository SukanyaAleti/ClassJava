public class Student {
        private String name ;

        public String getName() {
            return name;
        }

        public void setName(String newName) {
            name = newName;
        }
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Sukanya Aleti");
        System.out.println(student.getName());
    }
}


