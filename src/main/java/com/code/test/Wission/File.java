package com.code.test.Wission;

public class File implements FileParent {
    private String name;
    private double size; // in MB or KB
    private String createdBy;
    private String updatedBy;

    public File(String name, double size) {
        this.name = name;
        this.size = size;
    }
    @Override
    public void add(FileParent file) {
        throw new UnsupportedOperationException("Cannot add to a file.");

    }
    @Override
    public void delete(FileParent file) {
        System.out.println("File deleted: " + name);
    }
    @Override
    public void rename(String newName) {
        this.name = newName;
    }
    @Override
    public double getSize() {
        return this.size;
    }
}
