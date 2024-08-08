package org.example.behavioralpatterns.iterator;

import java.util.List;

public class ListIterator implements CustomIterator {
    private List<Object> list;
    private int index;

    public ListIterator(List<Object> list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < list.size();
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return list.get(index++);
        }
        return null;
    }
}

