package src;

import src.domain.Doctor;
import src.domain.Patient;
import src.filters.Filter;
import src.filters.FilterDoctorByGrade;
import src.filters.FilterDoctorBySpecialty;
import src.repository.DoctorRepo;
import src.repository.Repository;
import src.service.Service;
import src.ui.UI;

import javax.print.Doc;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            Doctor d1 = new Doctor(123,"John Smith", "cardiology", "Cluj", 9.6);
            Doctor d2 = new Doctor(1, "Anna Smith", "ortopedy", "Cluj", 9.7);
            Doctor d3 = new Doctor(1, "Mark Birdie", "cardiology", "Cluj", 8.7);

            ArrayList<Doctor> doctors = new ArrayList<>();
            doctors.add(d1);
            doctors.add(d2);
            doctors.add(d3);

            Filter<Doctor> filterBySpec = new FilterDoctorBySpecialty("cardiology");
            Filter<Doctor> filterByGrade = new FilterDoctorByGrade(9.0);

            for (Doctor d: doctors)
            {
                if (filterByGrade.accept(d))
                    System.out.println(d);
            }

//            Patient p1 = new Patient("abcd", "John", 12344523);
//            Patient p2 = new Patient("abcd", "Anna", 123);
//
//
            DoctorRepo repo = new DoctorRepo();
            Service serv = new Service(repo);
            serv.addDoctor(1223, "John Smith", "cardiology", "Cluj", 9.6);
            serv.addDoctor(5672, "Anna Smith", "ortopedy", "Cluj", 9.7);

            UI ui = new UI(serv);
            ui.run();

        }
    }