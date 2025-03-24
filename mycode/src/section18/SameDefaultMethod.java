package section18;

// interface with same method signature

interface InterfaceA{
    default void methodA(){
        System.out.println("Inside interface A");
    }
}

interface InterfaceB{
    default void methodA(){
        System.out.println("Inside interface B");
    }
}


public class SameDefaultMethod implements InterfaceA, InterfaceB{

    //If we dont override we will get error in the implements line
    @Override
    public void methodA() {
        System.out.println("Inside subClass");
    }

    public static void main(String[] args) {
        SameDefaultMethod obj = new SameDefaultMethod();
        obj.methodA();
    }
}
