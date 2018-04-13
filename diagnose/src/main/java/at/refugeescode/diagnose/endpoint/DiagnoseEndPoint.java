package at.refugeescode.diagnose.endpoint;

import at.refugeescode.diagnose.controller.DrHouse;
import at.refugeescode.diagnose.model.Patient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/patients")
public class DiagnoseEndPoint {
 private DrHouse drHouse;

    public DiagnoseEndPoint(DrHouse drHouse) {
        this.drHouse = drHouse;
    }

    @PostMapping
    void getPatient(@RequestBody Patient patient){
        Patient drHouseDiagnoses = drHouse.diagnose(patient);
        System.out.println(drHouseDiagnoses);
    }
}
