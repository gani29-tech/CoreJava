package com.techouts.cj4;

import java.util.logging.Level;
import java.util.logging.Logger;

class RefInstance {
    int id;

    void setId() {
        this.id = 1;
    }
}

class ConstructorDemo {
    private static final Logger logger = Logger.getLogger(ConstructorDemo.class.getName());
    int value;

    public ConstructorDemo() {
        logger.info("Default Constructor called");
    }

    public ConstructorDemo(int value) {
        this();
        this.value = value;
    }
}

class MethodInvoker {
    private static final Logger logger = Logger.getLogger(MethodInvoker.class.getName());

    void display() {
        logger.info("Display method executed");
    }

    void show() {
        logger.info("Show method executed");
    }
}

class ReturnThis {
    private static final Logger logger = Logger.getLogger(ReturnThis.class.getName());

    ReturnThis getInstance() {
        return this;
    }

    void display() {
        logger.info("Display method executed");
    }
}

class PassThisToConstructor {
    private static final Logger logger = Logger.getLogger(PassThisToConstructor.class.getName());
    CurrentObject obj;

    PassThisToConstructor(CurrentObject obj) {
        this.obj = obj;
    }

    void showMessage() {
        logger.info("Message from PassThisToConstructor");
    }
}

class CurrentObject {
    public CurrentObject() {
        PassThisToConstructor passObj = new PassThisToConstructor(this);
        passObj.showMessage();
    }
}

class PassThisToMethod {
    private static final Logger logger = Logger.getLogger(PassThisToMethod.class.getName());

    void showMessage(PassThisToMethod passObj) {
        logger.log(Level.INFO, "Message from PassThisToMethod {0}", passObj);
    }

    void callMethod() {
        showMessage(this);
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        new ConstructorDemo(4);
        RefInstance refObj = new RefInstance();
        refObj.setId();
        MethodInvoker methodObj = new MethodInvoker();
        methodObj.display();
        methodObj.show();
        new ReturnThis().getInstance().display();
        PassThisToMethod showMessage = new PassThisToMethod();
        showMessage.callMethod();

    }
}
