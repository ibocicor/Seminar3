package src.repository;

import src.domain.Identifiable;
import src.domain.Doctor;

import java.io.*;


public class DoctorsRepositoryTextFile extends FileRepository<Doctor, Integer> {
    @Override
    protected void readFromFile()  {
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = null;
            while ((line = reader.readLine())!= null) {
                String[] stringArray = line.split(",");
                if (stringArray.length != 5) {
                    continue;
                } else {
                    Doctor doc = new Doctor(Integer.parseInt(stringArray[0].trim()), stringArray[1].trim(), stringArray[2].trim(), stringArray[3].trim(), Double.parseDouble(stringArray[4].trim()));
                    this.MemElements.add(doc);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void writeToFile() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                for (Doctor d: getALlItems())
                {
                    writer.write(d.getId() + "," +
                                        d.getName() + "," +
                                        d.getSpecialty() + "," +
                                        d.getLocation() + ", " +
                                        d.getGrade() + "\n");
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    public DoctorsRepositoryTextFile(String filename) {
        super(filename);
    }
}
