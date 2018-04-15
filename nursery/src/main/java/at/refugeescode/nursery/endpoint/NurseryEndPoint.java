package at.refugeescode.nursery.endpoint;

import at.refugeescode.nursery.persistence.model.Patient;
import at.refugeescode.nursery.persistence.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/patients")
public class NurseryEndPoint {

    private PatientRepository patientRepository;

    private RestTemplate restTemplate;

    @Value("${accountancy.url}")
    private String accountancyUrl;

    public NurseryEndPoint(PatientRepository patientRepository, RestTemplate restTemplate) {
        this.patientRepository = patientRepository;
        this.restTemplate = restTemplate;
    }

    @PostMapping
    Patient getPatient(@RequestBody Patient patient) {
        Patient savedPatient = patientRepository.save(patient);
        Patient result = restTemplate.postForEntity(accountancyUrl, patient, Patient.class).getBody();
        return savedPatient;
    }
}
