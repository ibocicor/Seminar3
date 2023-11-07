package src;

import src.domain.Doctor;
import src.domain.Patient;
import src.filters.Filter;
import src.filters.FilterDoctorByGrade;
import src.filters.FilterDoctorBySpecialty;
import src.repository.*;
import src.service.Service;
import src.ui.UI;

import javax.print.Doc;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        IRepository<Doctor, Integer> docRepo = new DoctorsRepositoryTextFile("doctors.txt");
//        for (Doctor doc : docRepo.getALlItems()) {
//            System.out.println(doc);
//        }
//        docRepo.addItem(new Doctor(5, "Doc5", "Specialty5", "Location5", 5));
//        }

        // test binary file
        IRepository<Doctor, Integer> docRepo = new DoctorsRepositoryBinaryFile("doctors.bin");
        //docRepo.addItem(new Doctor(1, "John", "Cardiology", "Cluj", 9));
        //docRepo.addItem(new Doctor(2, "Anna", "Stomatology", "Cluj", 9.5));

        for (Doctor doc : docRepo.getALlItems())
            System.out.println(doc);
    }
}