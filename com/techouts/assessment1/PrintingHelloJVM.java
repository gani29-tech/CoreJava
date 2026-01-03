package com.techouts.assessment1;

public class PrintingHelloJVM {
    public static void main(String[] args) {
        System.out.println("Hello JVM");
        // 1. Compilation : convert Source code(.java) into Bytecode(.class),Bytecode is Machine Independent.
        // 2. ClassLoader : Loads the PrintingHelloJVM file to memory . It reads the bytecode and make it available for execution.
        // 3. Linking : Bytecode is verified for correctness.
        // 4. Initialization : Static variables/methods like main() are initialized.
        // 5. Execution : Bytecode is executed using Execution Engine.
        //     JIT (Just In Time) compiler may execute hot code into native machine for speed.
        //     main() Method starts Execution.
        // 6. Runtime Data Areas :
        //     Heap -> Stores objects
        //     Stack -> stores local variables , method calls
        //     Method Area -> stores class information
        // 7. JNI : Native Method Interface
        //     If the program needs to interact with native (non-Java) libraries
        //     (like operating system's I/O operations for 'System.out.println'),
        //     the JNI provides the bridge.
        // 8. Termination : main() finishes executing , JVM shuts down and free up all allocated resources.
    }
}
