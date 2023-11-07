package src.repository;
import src.domain.Doctor;
import java.util.ArrayList;

public class Repository {
    private ArrayList<Doctor> elements = new ArrayList<>();

    public void addDoctor(Doctor d)
    {
        this.elements.add(d);
    }

    public ArrayList<Doctor> getAll()
    {
        return this.elements;
    }
}
