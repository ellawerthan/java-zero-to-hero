package ee.itcollage.level8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonGrouper {

    //todo fix tests
    public static Map<String, Person> groupPeopleByIdCode(List<Person> people) {
        Map<String,Person> groupedPeople = new HashMap<>();
        for (int i = 0; i < people.size(); i++) {
            groupedPeople.put(people.get(i).getIdCode(), people.get(i));
        }
        return groupedPeople;
    }

}
