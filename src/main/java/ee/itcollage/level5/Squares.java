package ee.itcollage.level5;

import java.util.ArrayList;
import java.util.List;

public class Squares {

    //todo fix tests

    /**
     * squares all numbers in a list, for example:
     * 1, 2, 3 will be
     * 1, 4, 9
     */
    public static List<Integer> square(List<Integer> integers){
        List<Integer> squares = new ArrayList<>();
        for (int i = 0; i < integers.size(); i++) {
            squares.add(integers.get(i) * integers.get(i));
        }
        return squares;
    }
}
