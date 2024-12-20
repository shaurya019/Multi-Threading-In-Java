class t1 implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running");
    }
}

public class MainRunnable {
    public static void  main(String[] args){
        t1 obj = new t1();
        Thread  x = new Thread(obj);
        x.start();
    }
}
