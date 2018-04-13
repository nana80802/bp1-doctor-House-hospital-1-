package at.refugeescode.admission.model;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component
public class Patient {
    private String id;
    private String name;
    private List<String> symptoms;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(List<String> symptoms) {
        this.symptoms = symptoms;
    }



    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", symptoms=" + symptoms +
                '}';
    }
}

