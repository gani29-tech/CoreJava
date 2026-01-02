package com.techouts.cj4;
class RefInstance{
    int id;
    void setId(){
        this.id=1;
    }
}

class ConstructorDemo{
    int value;
    public ConstructorDemo(){
        System.out.println("Default constructor called");
    }
    public ConstructorDemo(int value){
        this();
        this.value=value;
    }
}

class MethodInvoker{
    void display(){
        System.out.println("Display method executed");
    }
    void show(){
        System.out.println("Show method executed");
    }
}

class ReturnThis{
    ReturnThis getInstance(){
        return this;
    }
    ReturnThis showData(){
        return this;
    }
    void display(){
        System.out.println("Display method executed");
    }
}

class PassThisToConstructor{
    CurrentObject obj;
    PassThisToConstructor(CurrentObject obj){
        this.obj=obj;
    }
    void showMessage(){
        System.out.println("Message from PassThisToConstructor");
    }
}

class CurrentObject{
    public CurrentObject(){
        PassThisToConstructor passObj=new PassThisToConstructor(this);
        passObj.showMessage();
    }
}

class PassThisToMethod{
    void showMessage(PassThisToMethod passObj){
        System.out.println("Message from method argument");
    }
    void callMethod(){
        showMessage(this);
    }
}

public class ThisDemo{
    public static void main(String[] args){
        RefInstance refObj=new RefInstance();
        refObj.setId();
        MethodInvoker methodObj=new MethodInvoker();
        methodObj.display();
        new ReturnThis().getInstance().display();
        PassThisToMethod showMessge =new PassThisToMethod();
        showMessge.callMethod();

    }
}
