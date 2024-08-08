package org.example.behavioralpatterns.observer;


public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        NewsReader reader1 = new NewsReader("Reader 1");
        NewsReader reader2 = new NewsReader("Reader 2");
        NewsReader reader3 = new NewsReader("Reader 3");

        newsAgency.attach(reader1);
        newsAgency.attach(reader2);
        newsAgency.attach(reader3);

        newsAgency.setNews("Breaking news: Observer pattern is awesome!");
    }
}
