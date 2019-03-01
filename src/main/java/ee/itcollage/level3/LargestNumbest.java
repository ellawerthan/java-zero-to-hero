package ee.itcollage.level3;

public class LargestNumbest {

    //todo make tests work

    public static int pickLargest(int x1, int x2) {
        if (x2 > x1) {
            return x2;
        } else {
            return x1;
        }
    }

    public static int pickLargest(int x1, int x2, int x3) {
        if (x2 > x1) {
            return x2;
        }
        else if (x1 > x3){
            return x1;
        } else {
            return x3;
        }
    }
}
