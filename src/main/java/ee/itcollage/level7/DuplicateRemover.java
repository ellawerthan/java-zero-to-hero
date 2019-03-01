package ee.itcollage.level7;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {

    //todo fix tests
    public static List<Integer> removeDuplicates(List<Integer> numbers) {
        List<Integer> noDuplicates = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            boolean duplicate = false;
            for (int j = 0; j < noDuplicates.size(); j++) {
                if (numbers.get(i) == noDuplicates.get(j)) {
                    duplicate = true;
                }
            }
            if (!duplicate) {
                noDuplicates.add(numbers.get(i));
            }
        }
        return noDuplicates;
    }
}
