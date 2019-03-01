package ee.itcollage.level4;

import java.util.List;

public class SumOfNumbers {

    //todo make tests work
    public static Integer sum(List<Integer> integerList) {
        if (integerList == null || integerList.isEmpty()) return null;
        int sum = 0;
        for (int i = 0; i < integerList.size(); i++) {
            sum += integerList.get(i);
        }
        return sum;
    }
}
