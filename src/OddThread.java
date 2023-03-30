public class OddThread extends Thread {
    private Thread t;

    public OddThread() {
    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                if(i%2!=0){
                    System.out.println(i);
                    Thread.sleep(1000);
                }
            }
        } catch (InterruptedException e) {
            System.out.println("My thread was interrupted");
        }
        System.out.println("Odd thread run is over");
    }
}
