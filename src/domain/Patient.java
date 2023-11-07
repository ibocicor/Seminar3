package src.domain;

import java.util.Objects;

public class Patient implements Identifiable<String> {
    String id;
    Integer phoneNumber;
    String name;


    public Patient(String id, String name, Integer phoneNumber) {
        this.name = name;
        this.id = id;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o.getClass() != Patient.class)
            return false;
        Patient d = (Patient) o;
        if (Objects.equals(d.id, this.id))
            return true;
        return false;
    }
}
