package section18;

interface Interface1{

    default void methodA(){
        System.out.println("Inside method A");
    }
}

interface Interface2 extends Interface1{

    default void methodB(){
        System.out.println("Inside method B");
    }

    default void methodA(){
        System.out.println("Inside method A"+Interface2.class);
    }
}

public class DefaultMethodOverride implements Interface1, Interface2{

    public void methodA(){         //if we dont mention the access modifier than my default it will use Package-private (default) and we cant have a more restrictive access modifier in sub-class so we need to use public
        System.out.println("Inside method A"+DefaultMethodOverride.class);
    }

    public static void main(String[] args) {

        DefaultMethodOverride object = new DefaultMethodOverride();
        object.methodA();
        object.methodB();
    }
}
