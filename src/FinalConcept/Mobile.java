package FinalConcept;
final class Mobile {

     private final int price;

     public Mobile(int price){
         this.price = price;
     }
    final void displayPrice() {
         System.out.println("The price of mobile is $" + price);
    }

}


