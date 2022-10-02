import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    private int maxLen;

    public PersonComparator(int maxLen) {
        this.maxLen = maxLen;
    }

    @Override
    public int compare(Person p1, Person p2) {
        String[] len1 = p1.getSurname().split(" ");
        String[] len2 = p2.getSurname().split(" ");
        if (Math.min(len1.length, maxLen) != Math.min(len2.length, maxLen)) {
            return Integer.compare(len1.length, len2.length);
        }
        return Integer.compare(p1.getAge(), p2.getAge());

    }
}
