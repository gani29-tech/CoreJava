package com.techouts.multithreading;

class PrintTable {
    void printTable(int n) {

        synchronized (this) {
            for (int i = 1; i <= n; i++) {
                System.out.println(Thread.currentThread().getName());
                if (i % 2 == 0)
                    System.out.println(i);
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println("Completed");
    }
}

class PrintExample1 extends Thread {
    PrintTable printTable;

    public PrintExample1(PrintTable printTable) {
        this.printTable = printTable;
    }

    @Override
    public void run() {
        printTable.printTable(4);

    }
}

class PrintExample2 extends Thread {
    PrintTable printTable;

    public PrintExample2(PrintTable printTable) {
        this.printTable = printTable;
    }

    @Override
    public void run() {
        printTable.printTable(6);
    }
}

public class SynchronizedBlock {
    public static void main(String[] args) {
        PrintTable printTable = new PrintTable();
        PrintExample1 printExample1 = new PrintExample1(printTable);
        PrintExample2 printExample2 = new PrintExample2(printTable);
        printExample1.start();
        printExample2.start();
    }
}
