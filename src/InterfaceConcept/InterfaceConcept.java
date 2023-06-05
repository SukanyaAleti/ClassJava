package InterfaceConcept;

public class InterfaceConcept {
    public static void main(String[] args) {
        DebitCard d = new DebitCard();
        d.deposit1(500);
        d.deposit1(300);
        d.deposit2(200);
        d.deposit2(100);
        d.displayBalances();
    }
}
