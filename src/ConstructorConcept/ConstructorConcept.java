package ConstructorConcept;

public class ConstructorConcept {
        public static void main(String[] args) {
            Person person = new Person("Sukanya");
            Students s1 = new Students("Aliya", 10);
            Students s2 = new Students(7);

            System.out.println(person.name);
            System.out.println(s1.name);
            System.out.println(s1.grade);
            System.out.println(s2.name);
            System.out.println(s2.grade);
        }
}
