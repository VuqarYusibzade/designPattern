package org.example.structuralpatterns.adapter;

public class PDFPrinterAdapter implements DocumentPrinter {
    private DocumentReader documentReader;

    public PDFPrinterAdapter(DocumentReader documentReader) {
        this.documentReader = documentReader;
    }

    @Override
    public void printDocument(String document) {
        String content = documentReader.readDocument();
        System.out.println("Printing PDF document:");
        System.out.println(content);
    }
}
