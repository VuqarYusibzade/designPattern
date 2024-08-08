package org.example.structuralpatterns.adapter;

public class PDFReader implements DocumentReader {
    @Override
    public String readDocument() {
        return "Contents of PDF document";
    }
}