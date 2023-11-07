package src.filters;

import src.domain.Doctor;

public class FilterDoctorBySpecialty implements Filter<Doctor>{
    private String specialty;

    public FilterDoctorBySpecialty(String specialty) {
        this.specialty = specialty;
    }

    @Override
    public boolean accept(Doctor d) {
        return d.getSpecialty().equals(specialty);
    }
}
