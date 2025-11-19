package exercises;

import edu.touro.mcon264.apps.collections.LinkedCollection;
import edu.touro.mcon264.support.LLNode;

public class   LinkedListAdvancedSet <T> extends LinkedCollection<T> implements AdvanceSetInterface <T> {
    public LinkedListAdvancedSet() {
        super();
    }


    @Override
    public AdvanceSetInterface<T> union(AdvanceSetInterface<T> anotherSet) {
        LinkedListAdvancedSet<T> result = new LinkedListAdvancedSet();
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
    //TODO: implement the methods in the AdvanceSetInterface using a linked list as the underlying data structure

}
