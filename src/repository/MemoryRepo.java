package src.repository;

import src.domain.Identifiable;

import java.util.ArrayList;

public class MemoryRepo<T, U> implements IRepository<T,U>{

    ArrayList<T> MemElements = new ArrayList<T>();
    @Override
    public void addItem(T item) {
//        for(T aux: MemElements)
//            if(aux.getId().equals(item.getId()))
//                return;
//        MemElements.add(item);
    }

    @Override
    public boolean removeItem(T item) {
        return false;
    }

    @Override
    public T findItem(U id) {
        return null;
    }

    @Override
    public Iterable<T> getALlItems() {
        return MemElements;
    }
}
