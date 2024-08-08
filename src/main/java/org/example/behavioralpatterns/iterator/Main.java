package org.example.behavioralpatterns.iterator;

public class Main {
    public static void main(String[] args) {
        ListContainer listContainer = new ListContainer();
        listContainer.add("Item 1");
        listContainer.add("Item 2");
        listContainer.add("Item 3");

        CustomIterator iterator = listContainer.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}