package June06;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CSVReader {
    public static void main(String[] args) {
        String s = "/Users/sukanyaaleti/Desktop/StudentsData.csv";
       try (BufferedReader br = new BufferedReader(new FileReader(s))) {
           String line;
           br.readLine();
           List<Student> students = new ArrayList<>();
           while ((line = br.readLine()) != null) {
               String[] values = line.split(",");
               Student student = new Student(values[0], values[1], Double.parseDouble(values[2]));
                students.add(student);
           }
           Collections.sort(students);

           for (Student student : students) {
               System.out.println(student);
           }
       }catch(IOException e){
            e.printStackTrace();
        }
    }

    static class Student implements Comparable<Student> {
        private String firstName;
        private String lastName;
        private double gpa;

        public Student(String firstName, String lastName, double gpa) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.gpa = gpa;
        }

        public String getLastName() {
            return lastName;
        }

        @Override
        public int compareTo(Student otherStudent) {
            return this.lastName.compareTo(otherStudent.getLastName());
        }

        @Override
        public String toString() {
            return firstName + " " + lastName + " - GPA: " + gpa;
        }
    }
}






