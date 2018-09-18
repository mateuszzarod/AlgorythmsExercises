//I would like to be able to pass an array with two elements to my swapValues function to swap the values.
// However it appears that the values aren't changing.

import java.util.Arrays;
import java.util.Collections;
//How to swap walues ine
public class Swapper {
    public Object[] arguments;

    public Swapper(final Object[] args){

        arguments=args;
    }

    public void swapValues() {
        Object temp = arguments[0];
        arguments[0] = arguments[1];
        arguments[1] = temp;
    }
}

