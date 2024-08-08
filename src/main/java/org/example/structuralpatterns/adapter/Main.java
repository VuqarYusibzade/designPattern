package org.example.structuralpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        DocumentReader pdfReader = new PDFReader();
        DocumentPrinter printer = new PDFPrinterAdapter(pdfReader);
        printer.printDocument("Sample PDF Document");
    }
}