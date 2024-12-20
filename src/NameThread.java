//Naming a thread and getting id form it
class MyThr extends Thread{
    public MyThr(String name){
        super(name);
    }
    public  void run(){
        int i=0;
        while(i<5){
            System.out.println("I am Thread");
            i++;
        }
    }
}
public class NameThread {
  public static void main(String[] args) {
      MyThr x = new MyThr("Harry");
      x.start();
      System.out.println(x.getName());
  }
}
