package com.code.test.Wission;

public interface FileParent {
    void add(FileParent file);
    void delete(FileParent file);
    void rename(String newName);
    double getSize();
}
