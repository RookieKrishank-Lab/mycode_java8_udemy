package section17.optional;

import java.util.Optional;

public class OptionalOfEmptyNullable {

    //use "ofNullable" when we are unsure about the input value
    public static Optional<String> ofNullable(){
        Optional<String> optionalString = Optional.ofNullable(null);
        return optionalString;
    }

    //use "of" when we are sure that the input value is present
    public static Optional<String> of(){
        Optional<String> optionalString = Optional.of("Hi");
        return optionalString;
    }

    //use "empty" when we are sure that the input value is NOT present
    public static Optional<String> empty(){
        Optional<String> optionalString = Optional.empty();
        return optionalString;
    }


    public static void main(String[] args) {

        //ofNullable
        //System.out.println("ofNullable : "+ofNullable().get());
        //when the O/P is null for ofNullable
        System.out.println("ofNullable when null: "+ofNullable());

        //of
        System.out.println("of : "+of().get());
        //when the O/P is null for ofNullable
        //System.out.println("of : "+of().get());        //return NPE

        //empty
        System.out.println("empty : "+of().get());
        //when the O/P is null for ofNullable
        //System.out.println("of : "+of().get());        //return NPE
    }
}
