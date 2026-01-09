package com.techouts.assessment1;

import java.util.logging.Logger;

public class HelloJVM {
    private static final Logger logger = Logger.getLogger(HelloJVM.class.getName());

    public static void main(String[] args) {
        logger.info("Hello JVM");
        // 1. Compilation:
        //    Source code (.java) is compiled into bytecode (.class).
        //    Bytecode is platform independent.

        // 2. Class Loader Subsystem:
        //    Loads the .class file into JVM memory.
        //    It performs:
        //      a) Loading
        //      b) Linking
        //         - Verification (bytecode correctness)
        //         - Preparation (memory allocation for static variables)
        //         - Resolution (symbolic references resolved)
        //      c) Initialization (static blocks and static variables)

        // 3. Initialization:
        //    Static variables and static blocks are executed.
        //    After initialization, JVM invokes the main() method.

        // 4. Execution:
        //    Bytecode is executed by the Execution Engine.
        //    - Interpreter executes bytecode line by line.
        //    - JIT compiler converts frequently used bytecode into native machine code
        //      for better performance.

        // 5. Runtime Data Areas (Memory Areas):
        //    - Heap: Stores objects and instance variables.
        //    - Stack: Stores method calls and local variables (thread-specific).
        //    - Method Area: Stores class metadata, static variables, and method bytecode.
        //    - PC Register: Holds current instruction address.
        //    - Native Method Stack: Used for native method execution.

        // 6. JNI (Java Native Interface):
        //    Provides a bridge between Java code and native (C/C++) libraries
        //    when native methods are used.

        // 7. Termination:
        //    When main() finishes execution and no non-daemon threads are running,
        //    JVM terminates and releases all allocated resources
    }
}
