package src.repository;

import src.domain.Identifiable;

import java.io.BufferedReader;
import java.io.FileReader;

public abstract class FileRepository<T extends Identifiable<U>, U> extends MemoryRepo<T,U> {

    protected String fileName;

    public FileRepository(String fileName) {
        this.fileName = fileName;
        readFromFile();
    }

    protected abstract void readFromFile();
    protected abstract void writeToFile();
    @Override
    public void addItem(T item)
    {
        super.addItem(item);
        writeToFile();
    }
    @Override
    public boolean removeItem(T item)
    {
        boolean result = super.removeItem(item);
        writeToFile();
        return result;
    }
}
