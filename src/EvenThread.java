public class EvenThread extends Thread {
    private Thread t;

    public EvenThread() {
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(i%2==0){
                    System.out.println(i);
                    Thread.sleep(1500);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("My thread was interrupted");
        }
        System.out.println("Even thread run is over");
    }

}
