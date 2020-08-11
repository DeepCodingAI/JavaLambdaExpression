package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdaDemo {
    public void demo(Fly fly){
        fly.howToFly();
    }
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Mango", "Banana", "Orange", "Barry");
        System.out.println("Using for loop");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Using for each loop");
        for (String fruit : list) {
            System.out.println(fruit);
        }
        System.out.println("Using lambda for each loop");
        list.forEach(st -> System.out.println(st));
        System.out.println("Using lambda Stream");
        list.stream()
                .filter(st -> st.startsWith("B"))
                .forEach(st -> System.out.println(st));

        Consumer<String> consumerFirst = s -> System.out.println(s);
        Consumer consumerSecond = s -> System.out.println(s + " second consumer");
        Consumer<String> combined = consumerFirst.andThen(consumerSecond);
        combined.accept(" outcome");

        list.stream()
                .filter(new Predicate<String>() {
                    @Override
                    public boolean test(String s) {
                        return false;
                    }
                })
                .forEach(st -> System.out.println(st));

        Count cal = new Calculator();
        int result1 = cal.addition(10,20);
        System.out.println(result1);

        Count count = new Count() {
            @Override
            public int addition(int a, int b) {
                int total = a + b;
                return total;
            }
        };
        int result2 = count.addition(10,20);
        System.out.println(result2);

        Count lambdaCount = (a,b)-> {return a + b;};
        int result3 = lambdaCount.addition(10, 20);
        System.out.println(result3);

        RideSharing rideSharing = s-> System.out.println(s);
        rideSharing.rideWithOnDemand("Need a ride");

        Machine machine = CalMachine::displayResult;
        machine.displayResult("digits shown");
        Fly fly = ()->System.out.println("Flying by Aeroplane");

        LambdaDemo lambdaDemo = new LambdaDemo();
        lambdaDemo.demo(fly);
    }
}
