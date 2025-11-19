package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;

public class UnsortedArrayAdvancedSet <T> extends ArrayCollection <T> implements AdvanceSetInterface <T> {
    @Override
    public AdvanceSetInterface<T> union(AdvanceSetInterface<T> anotherSet) {
        return null;
    }

    @Override
    public AdvanceSetInterface<T> intersection(AdvanceSetInterface<T> anotherSet) {
        return null;
    }

    @Override
    public AdvanceSetInterface<T> difference(AdvanceSetInterface<T> anotherSet) {
        return null;
    }
    //TODO: implement the methods in the AdvanceSetInterface using an unsorted array as the underlying data structure
}
