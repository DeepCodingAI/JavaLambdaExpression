package classic;

public class PaymentSystem {
    public void outerMethod(){
        System.out.println("Whole Payment System");
        DebitCard debitCard = new DebitCard();
        debitCard.payWithDebitCard();
        DebitCardWithLambda lambda = new DebitCardWithLambda();
        lambda.payWithDebitCardLambda();
        Pay pay = new DebitCard();
        pay.payWithSmartSystem();

    }

    public class CreditCard{
        public void payWithCreditCard(){
            System.out.println("pay with credit card");
        }
    }

    public static class DebitCard implements Pay{
        @Override
        public void payWithSmartSystem() {
            System.out.println("pay with smart cards");
        }

        public  interface Card{
             void pay();
        }
        public void payWithDebitCard(){
            Card card = new Card(){
                @Override
                public void pay() {
                    System.out.println("pay with debit card");
                }
            };
            card.pay();
            NFI nfi = new NFI(){
                @Override
                public void useNFI() {
                    System.out.println("pay with NFI");
                }
            };
            nfi.useNFI();
        }

    }
    public static class DebitCardWithLambda{
        public  interface Card{
              void pay();
        }
        public void payWithDebitCardLambda(){
            Card card = () ->  {
                    System.out.println("");
                    System.out.println("pay with debit card lambda");
                };
            card.pay();

            NFI nfi = () -> System.out.println("pay with NFI lambda");
            nfi.useNFI();
        }

    }
}
