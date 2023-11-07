package src;

import src.domain.Doctor;
import src.domain.Patient;
import src.filters.Filter;
import src.filters.FilterDoctorByGrade;
import src.filters.FilterDoctorBySpecialty;
import src.repository.DoctorRepo;
import src.repository.DoctorsRepositoryTextFile;
import src.repository.IRepository;
import src.repository.Repository;
import src.service.Service;
import src.ui.UI;

import javax.print.Doc;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        IRepository<Doctor, Integer> docRepo = new DoctorsRepositoryTextFile("doctors.txt");
        for (Doctor doc : docRepo.getALlItems()) {
            System.out.println(doc);
        }
        }
    }