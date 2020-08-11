package lambda;

public class RunnableThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Our Runnable Interface");
            }
        });
        thread.run();

        Thread lambdaThread = new Thread(()-> System.out.println("Our lambda Runnable Interface"));
        lambdaThread.run();



    }


}
