//Naming a thread and getting id form it
class Thr1 extends Thread{
    public Thr1(String name){
        super(name);
    }
    public  void run(){
        System.out.println("I am Thread " + getName());
    }
}
public class PriorityThread {
    public static void main(String[] args) {
        Thr1 t1 = new Thr1("1");
        Thr1 t2 = new Thr1("2");
        Thr1 t3 = new Thr1("3");
        t1.start();
        t2.start();
        t3.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t3.getName());
    }
}
