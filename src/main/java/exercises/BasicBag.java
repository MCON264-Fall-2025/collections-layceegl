package exercises;

import edu.touro.mcon264.apps.collections.ArrayCollection;
import edu.touro.mcon264.apps.collections.BagInterface;

public class BasicBag<T> extends ArrayCollection<T> implements BagInterface<T> {
    @Override
    public T grab() {
        if (size() == 0)
            return null;
        int randomIndex = (int) (Math.random() * size());
        T element = get(randomIndex);
        remove(element);   // Remove by value using inherited remove(T)
        return element;
    }

    @Override
    public int count(T target) {
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (get(i).equals(target))
                count++;
        }
        return count;
    }

    @Override
    public int removeAll(T target) {
        int removedCount = 0;
        // Keep removing target until it no longer exists
        while (remove(target)) {
            removedCount++;
        }
        return removedCount;
    }

    @Override
    public void clear() {
        // Remove elements until bag is empty
        while (!isEmpty()) {
            remove(elements[numElements - 1]);
        }
    }


    protected T get(int index) {
        if (index < 0 || index >= numElements) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return elements[index];
    }

    // TODO: implement the methods in the BagInterface using an array as the underlying data structure
    // consider extending ArrayCollection<T>
    // put in the JavaDoc comments as specified in the BagInterface.
    // Which SOLID principles is being applied here?


}
