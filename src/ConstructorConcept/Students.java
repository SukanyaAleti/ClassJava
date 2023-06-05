package ConstructorConcept;

public class Students extends Person {
        protected int grade; // Instance variable in the child class

        public Students(String name, int grade) {
            super(name); // Calling the parent class constructor to initialize the 'name' variable
            this.grade = grade;
        }

        // Overloaded constructor with only child class parameter, assigns default value to parent class parameter
        public Students(int grade) {
            super(); // Calling the default constructor of the parent class to set default name value of 0
            this.grade = grade;
        }
    }

