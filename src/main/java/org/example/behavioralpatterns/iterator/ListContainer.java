package org.example.behavioralpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class ListContainer implements Container {
    private List<Object> list;

    public ListContainer() {
        this.list = new ArrayList<>();
    }

    public void add(Object element) {
        list.add(element);
    }

    @Override
    public CustomIterator getIterator() {
        return new ListIterator(list);
    }
}

