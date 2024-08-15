package section7;

public class RunnableMain {

    public static void main(String[] args) {

        //without lambda
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside runnable without lambda");
            }
        };
        //passing the runnable to thread and start thread
        new Thread(runnable).start();

        //with lambda
        Runnable runnableLambda = () -> System.out.println("Inside runnable with lambda");

        new Thread(runnableLambda).start();
    }
}
