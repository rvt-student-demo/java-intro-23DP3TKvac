package lv.rvt;

public class Main {
    public static void main(String[] args) {
        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);

        paul.eatHeartily();
        System.out.println("Paul: " + paul.toString());

        matt.eatAffordably();
        System.out.println("Matt: " + matt.toString());

        paul.addMoney(20);
        System.out.println("Paul: " + paul.toString());

        matt.eatHeartily();
        System.out.println("Matt: " + matt.toString());

        paul.eatAffordably();
        paul.eatAffordably();
        System.out.println("Matt: " + paul.toString());

        matt.addMoney(50);
        System.out.println("Matt: " + matt.toString());





        
    }
}
