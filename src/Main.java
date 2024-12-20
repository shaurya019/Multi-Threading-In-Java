class Multi extends Thread
{
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String[] args) {
        Multi func1 = new Multi();
        func1.start();
        Multi func2 = new Multi();
        func2.start();
    }
}
//Again, Func1() and Func2() are called inside the main function,
// but none of the two functions is waiting for the execution of the other function.
// Both the functions are getting executed concurrently.

//Ways To Create A Thread In Java
class MyThread extends Thread{
    @Override
    public void run(){

    }
}
