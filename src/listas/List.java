package listas;

// Introduced in Chapter 5
/**
 * A list of elements.
 *
 * @param <E>
 */
public interface List<E> extends Iterable<E> {

    /**
     * Add target to the back of this List.
     *
     * @param target
     */
    public void add(E target);

    /**
     * Return true if some item in this List equals() target.
     *
     * @param target
     * @return
     */
    public boolean contains(E target);

    /**
     * Return the indexth element of this List.
     *
     * @param index
     * @return
     */
    public E get(int index);

    /**
     * Return true if this List is empty.
     *
     * @return
     */
    public boolean isEmpty();

    /**
     * Remove and return the indexth element from this List, shifting all later
     * items one place left.
     *
     * @param index
     * @return
     */
    public E remove(int index);

    /**
     * Remove the first occurrence of target from this List, shifting all later
     * items one place left. Return true if this List contained the specified
     * element.
     *
     * @param target
     * @return
     */
    public boolean remove(E target);

    /**
     * Replace the indexth element of this List with target.
     *
     * @param index
     * @param target
     */
    public void set(int index, E target);

    /**
     * Return the number of elements in this List.
     *
     * @return
     */
    public int size();
}
