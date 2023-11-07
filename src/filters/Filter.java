package src.filters;

import src.domain.Doctor;
import src.domain.Identifiable;

public interface Filter<T extends Identifiable> {
    boolean accept(T d);
}
