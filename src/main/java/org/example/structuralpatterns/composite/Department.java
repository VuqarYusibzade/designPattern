package org.example.structuralpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Department implements Component {
    private String name;
    private List<Component> children;
    public Department(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    public void add(Component component) {
        children.add(component);
    }

    public void remove(Component component) {
        children.remove(component);
    }
    @Override
    public void showDetails() {
        System.out.println("Department: " + name);
        for (Component component : children) {
            component.showDetails();
        }
    }
}
