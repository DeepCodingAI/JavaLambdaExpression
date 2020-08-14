package classic;

public class TestPayment {
    public static void main(String[] args) {
        PaymentSystem pay = new PaymentSystem();
        pay.outerMethod();
        int tax = 8;
        processPayment(100, amount -> System.out.println(amount + tax));
    }

    public static void processPayment(int amount, Network network){
        network.visaNetwork(amount);
    }
    public interface Network{
        public void visaNetwork(int amount);
    }
}
