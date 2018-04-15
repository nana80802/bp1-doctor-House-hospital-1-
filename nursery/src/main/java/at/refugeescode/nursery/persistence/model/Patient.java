package at.refugeescode.nursery.persistence.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Patient {
    @Id
    private String tableId;
    private String id;
    private String name;
    private List<String> symptoms;
    private String illness;

    public Patient() {
    }

    public Patient(String tableId, String id, String name, List<String> symptoms, String illness) {
        this.tableId = tableId;
        this.id = id;
        this.name = name;
        this.symptoms = symptoms;
        this.illness = illness;
    }

    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

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

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }
}
