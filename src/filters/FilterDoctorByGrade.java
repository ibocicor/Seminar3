package src.filters;

import src.domain.Doctor;

public class FilterDoctorByGrade implements Filter<Doctor> {
    private Double minGrade;

    public FilterDoctorByGrade(Double minGrade) {
        this.minGrade = minGrade;
    }

    @Override
    public boolean accept(Doctor d) {
        return d.getGrade() > minGrade;
    }
}
