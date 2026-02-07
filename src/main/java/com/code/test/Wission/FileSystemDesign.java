package com.code.test.Wission;

import java.util.*;

public class FileSystemDesign {

    // Common interface for both File and Folder
    interface FileParent {
        void add(FileParent entity);
        void delete(FileParent entity);
        void rename(String newName);
        double size(); // method to get size
    }

    // ----------------------------------------------------
    // File class: represents a single file (leaf node)
    // ----------------------------------------------------
    static class FileEntity implements FileParent {
        private String id;
        private String name;
        private double fileSize;  // in MB or KB
        private Date createdOn;
        private String createdBy;
        private Date updatedOn;
        private String updatedBy;

        public FileEntity(String name, double fileSize) {
            this.id = UUID.randomUUID().toString();
            this.name = name;
            this.fileSize = fileSize;
            this.createdOn = new Date();
            this.createdBy = "System";
        }

        @Override
        public void add(FileParent entity) {
            throw new UnsupportedOperationException("Cannot add inside a file");
        }

        @Override
        public void delete(FileParent entity) {
            throw new UnsupportedOperationException("Cannot delete inside a file");
        }

        @Override
        public void rename(String newName) {
            this.name = newName;
            this.updatedOn = new Date();
        }

        @Override
        public double size() {
            return this.fileSize;
        }

        @Override
        public String toString() {
            return "File: " + name + " (" + fileSize + "MB)";
        }
    }

    // ----------------------------------------------------
    // Folder class: represents a directory (can contain files or folders)
    // ----------------------------------------------------
    static class Folder implements FileParent {
        private String name;
        private List<FileParent> children;

        public Folder(String name) {
            this.name = name;
            this.children = new ArrayList<>();
        }

        @Override
        public void add(FileParent entity) {
            children.add(entity);
        }

        @Override
        public void delete(FileParent entity) {
            children.remove(entity);
        }

        @Override
        public void rename(String newName) {
            this.name = newName;
        }

        @Override
        public double size() {
            double total = 0;
            for (FileParent entity : children) {
                total += entity.size();
            }
            return total;
        }

        @Override
        public String toString() {
            return "Folder: " + name + " (Size: " + size() + "MB)";
        }
    }

    // ----------------------------------------------------
    // MAIN METHOD
    // ----------------------------------------------------
    public static void main(String[] args) {
        FileEntity file1 = new FileEntity("Resume.pdf", 1.2);
        FileEntity file2 = new FileEntity("Photo.png", 2.5);
        FileEntity file3 = new FileEntity("Video.mp4", 20.0);

        Folder docs = new Folder("Documents");
        docs.add(file1);
        docs.add(file2);

        Folder media = new Folder("Media");
        media.add(file3);

        Folder root = new Folder("Root");
        root.add(docs);
        root.add(media);

        System.out.println(root);
    }
}