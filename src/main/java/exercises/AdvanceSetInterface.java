package exercises;

import edu.touro.mcon264.apps.collections.CollectionInterface;

/**
 * Advance Set Interface
 * @param <T>
 */
public interface AdvanceSetInterface <T> extends CollectionInterface<T> {
/*
 Starter code the exercise 6
 Design signatures for the following methods:
    union()
    intersection()
    difference()
 */
    public AdvanceSetInterface<T> union(AdvanceSetInterface<T> anotherSet);
    public AdvanceSetInterface<T> intersection(AdvanceSetInterface<T> anotherSet);
    public AdvanceSetInterface<T> difference(AdvanceSetInterface<T> anotherSet);

}
