package com.code.test.Wission;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileParent {
    private String name;
    private List<FileParent> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }
    @Override
    public void add(FileParent file) {
        children.add(file);
    }
    @Override
    public void delete(FileParent file) {
        children.remove(file);
    }
    @Override
    public void rename(String newName) {
        this.name = newName;
    }
    @Override
    public double getSize() {
        double totalSize = 0;
        for (FileParent f : children) {
            totalSize += f.getSize(); // recursive call
        }
        return totalSize;
    }
}
