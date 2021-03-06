package at.refugeescode.diagnose.controller;

import at.refugeescode.diagnose.model.Patient;
import at.refugeescode.diagnose.parser.IllnessParser;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Map;

@Controller
public class DrHouse {
    //private Patient patient;
    private IllnessParser illnessParser;

    public DrHouse(IllnessParser illnessParser) {
        this.illnessParser = illnessParser;
    }

    public Patient diagnose(Patient patient) {
        Map<String, List<String>> illnessesReference = illnessParser.getIllnesses();

        List<String> patientSymptoms = patient.getSymptoms();

        String illness = determineIllness(illnessesReference, patientSymptoms);
        patient.setIllness(illness);

        return patient;
    }

    private String determineIllness(Map<String, List<String>> illnessesReference, List<String> patientSymptoms) {
         return illnessesReference.entrySet().stream()
                .filter(e->e.getValue().containsAll(patientSymptoms)&&e.getValue().size()==patientSymptoms.size())
                .map(e->e.getKey())
                .findFirst().orElse("lupus");
    }
}
