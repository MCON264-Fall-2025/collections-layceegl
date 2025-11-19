package exercises;

import edu.touro.mcon264.apps.collections.SortedArrayCollection;

public class SortedArrayAdvancedSet <T> extends SortedArrayCollection <T> implements AdvanceSetInterface <T> {
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
    //TODO: implement the methods in the AdvanceSetInterface using a sorted array as the underlying data structure

}

