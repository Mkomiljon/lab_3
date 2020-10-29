import java.util.ArrayList;

public class IntegerSet {
    private final static int setSize = 101;
    private boolean[] set = new boolean[setSize];

    public IntegerSet() {
        for (int i = 0; i < setSize; i++) {
            set[i] = false;
        }
    }

    public IntegerSet(int ... numbers){
        for (int n : numbers) {
            insertElement(n);
        }
    }

    private boolean isInSet(int i) {
        if (i>=0 && i<setSize)
            return set[i];
        else
            throw new ArrayIndexOutOfBoundsException("Element out of range! Required: 0-100 Provided: " + i);
    }

    public void insertElement(int n) {
        if (n < setSize && n >= 0)
            set[n] = true;
        else
            throw new ArrayIndexOutOfBoundsException("Element out of range! Required: 0-100 Provided: " + n);
    }

    public void deleteElement(int m) {
        if (m < setSize && m >= 0)
            set[m] = false;
        else
            throw new ArrayIndexOutOfBoundsException("Element out of range! Required: 0-100 Provided: " + m);
    }

    public boolean isEqual(boolean[] set1, boolean[] set2){
        for (int i = 0; i < setSize; i++) {
            if (set1[i] != set2[i])
                return false;
        }
        return true;
    }

    public static IntegerSet union(IntegerSet set1, IntegerSet set2){
        IntegerSet unionSet = new IntegerSet();

        for (int i = 0; i < setSize; i++) {
            if (set1.isInSet(i) || set2.isInSet(i)){
                unionSet.insertElement(i);
            }
        }

        return unionSet;
    }

    public static IntegerSet intersection(IntegerSet set1, IntegerSet set2){
        IntegerSet intersectionSet = new IntegerSet();

        for (int i = 0; i < setSize; i++) {
            if (set1.isInSet(i) && set2.isInSet(i)){
                intersectionSet.insertElement(i);
            }
        }

        return intersectionSet;
    }

    @Override
    public String toString() {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < setSize; i++) {
            if (set[i])
                list.add(i);
        }
        return "IntegerSet:  " + list.toString();
    }
}
