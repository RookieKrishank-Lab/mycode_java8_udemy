package section10;

import java.util.function.Consumer;

class LocalVarReuseAndReassign {

    // instance var
    static int a =9;

    public static void main(String[] args) {

        //local variable
        int i =10;

        Consumer<Integer> localVar = i1 ->{             // here the parameter cant be i (ie local var)
//            int i =20;                            // cant use the local var inside body
//            i++;                                  // cant modify local variable value
//            System.out.println(i+i1);
            System.out.println(a+i1);
        };
//            i = 800;                                  // cant modify local variable value
        localVar.accept(4);
    }
}
