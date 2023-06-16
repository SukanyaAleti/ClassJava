package June15;

public class DeadlockTest {
        public static class Person {
            private String name;

            public Person(String name) {
                this.name = name;
            }

            public String getName() {
                return name;
            }

            public synchronized void exchangeItems(Person otherPerson) {
                System.out.println(this.name + " is waiting to receive items from " + otherPerson.getName());
                otherPerson.giveItems(this);
                System.out.println(this.name + " received items from " + otherPerson.getName());
            }

            public synchronized void giveItems(Person otherPerson) {
                System.out.println(this.name + " is giving items to " + otherPerson.getName());
            }
        }

        public static void main(String[] args) {
            Person p1 = new Person("Person 1");
            Person p2 = new Person("Person 2");

            Thread t1 = new Thread(() -> p1.exchangeItems(p2));
            Thread t2 = new Thread(() -> p2.exchangeItems(p1));

            t1.start();
            t2.start();
        }

}
