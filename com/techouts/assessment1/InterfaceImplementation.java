package com.techouts.assessment1;
interface OS{
    void reboot();
    default void run(){
        System.out.println("RUNNING");
    }
}
class Android implements OS{
    @Override
    public void reboot() {
        System.out.println("REBOOTING");
    }
}
public class InterfaceImplementation {
    public static void main(String[] args) {
        OS os = new Android();
        os.run();
        os.reboot();
    }
}
// Abstraction : Hiding Implementation details and showing necessary features
