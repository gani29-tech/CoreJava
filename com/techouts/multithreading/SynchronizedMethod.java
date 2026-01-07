package com.techouts.multithreading;

class Example1  {
   synchronized void t1(int n){
        for(int i=1;i<=n;i++){
            System.out.println(i*n);
            try{
                Thread.sleep(300);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class SynchronizedExample1 extends Thread{
    Example1 example1;
    public SynchronizedExample1(Example1 example1){
        this.example1 = example1;
    }
    @Override
    public void run(){
        example1.t1(3);
    }
}
class SynchronizedExample2 extends Thread{
    Example1 example1;
    public SynchronizedExample2(Example1 example1){
        this.example1 = example1;
    }
    @Override
    public void run(){
        example1.t1(5);
    }
}
public class SynchronizedMethod {
    public static void main(String[] args) {
        Example1 example1 = new Example1();
        SynchronizedExample1 synchronizedExample1 = new SynchronizedExample1(example1);
        SynchronizedExample2 synchronizedExample2 = new SynchronizedExample2(example1);
        synchronizedExample1.start();
        synchronizedExample2.start();

    }
}
