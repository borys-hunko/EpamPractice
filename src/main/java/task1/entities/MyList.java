package task1.entities;

import java.util.*;

public class MyList<T> implements List<T> {
    private T array[];
    private int numOfElements;
    private static final int INITIAL_CAPACITY = 10;

    public MyList() {
        array = (T[]) new Object[INITIAL_CAPACITY];
        numOfElements = 0;
    }

    @Override
    public int size() {
        return numOfElements;
    }

    @Override
    public boolean isEmpty() {
        return numOfElements==0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();

    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException();

    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean add(T t) {
        if(numOfElements==array.length){
            allocateMemoryForArray(array,(int)(array.length*1.5));
        }
        array[numOfElements]=t;
        numOfElements++;
        return true;
    }

    private void allocateMemoryForArray(T[] array,int newSize) {
        this.array=Arrays.copyOf(array,newSize);
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();

    }

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException();

    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();

    }

    @Override
    public ListIterator<T> listIterator() {
        throw new UnsupportedOperationException();

    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();

    }
}
