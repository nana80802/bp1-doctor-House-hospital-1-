package at.refugeescode.accountancy.endpoint;

import at.refugeescode.accountancy.persistence.model.Invoice;
import at.refugeescode.accountancy.persistence.model.Patient;
import at.refugeescode.accountancy.persistence.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping
public class NurseryEndPoint {

    private PatientRepository patientRepository;

    public NurseryEndPoint(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;

    }

    @PostMapping("/patients")
    void getPatient(@RequestBody Patient patient) {
//        Invoice invoice = patient.getInvoice();
//        invoice.setCost(100.0);
//        patient.setInvoices(invoice);
        patientRepository.save(patient);
    }

    @GetMapping("/invoices")
    List<Patient> showInvoices(){
        return patientRepository.findAll();
    }
}
