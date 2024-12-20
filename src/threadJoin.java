//Nif you want that t2 start only when t1 clear so use t1join
class Thr2 extends Thread{
    public Thr2(String name){
        super(name);
    }
    public  void run(){
        System.out.println("I am Thread " + getName());
    }
}
public class threadJoin {
    public static void main(String[] args) {
        Thr2 t1 = new Thr2("1");
        Thr2 t2 = new Thr2("2");
        Thr2 t3 = new Thr2("3");
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            System.out.println(e);
        }
        t2.start();
    }
}
