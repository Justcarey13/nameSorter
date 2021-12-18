import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        // Compare p1 to p2 by first comparing their last names
        // then by any given names they may have
        if (p1.getLastName().compareTo(p2.getLastName()) != 0) {
            return p1.getLastName().compareTo(p2.getLastName());
        } else {
            return p1.getFirstName().compareTo(p2.getFirstName());
        }
    }
}
