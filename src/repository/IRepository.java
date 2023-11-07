package src.repository;

import src.domain.Identifiable;

import java.util.Collection;

public interface IRepository<T extends Identifiable<U>, U > {

    public void addItem(T item);

    public boolean removeItem(T item);

    public T findItem(U id);

    public Iterable<T> getALlItems();
}
