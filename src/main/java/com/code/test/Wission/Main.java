package com.code.test.Wission;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("Root");

        File file1 = new File("photo.jpg", 1.5);
        File file2 = new File("resume.pdf", 0.8);

        Folder docs = new Folder("Documents");
        File doc1 = new File("report.docx", 2.0);
        docs.add(doc1);

        root.add(file1);
        root.add(file2);
        root.add(docs);

        System.out.println("Total size: " + root.getSize() + " MB");
    }
}
