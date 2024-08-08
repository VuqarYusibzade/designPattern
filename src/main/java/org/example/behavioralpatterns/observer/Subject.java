package org.example.behavioralpatterns.observer;

import java.util.Observer;

public interface Subject {
    void attach(org.example.behavioralpatterns.observer.Observer observer);

    void attach(Observer observer);
    void detach(Observer observer);

    void detach(org.example.behavioralpatterns.observer.Observer observer);

    void notifyObservers();
}
