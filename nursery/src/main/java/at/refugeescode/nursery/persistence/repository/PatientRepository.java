package at.refugeescode.nursery.persistence.repository;

import at.refugeescode.nursery.persistence.model.Patient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PatientRepository extends MongoRepository<Patient, String> {
    Patient save(Patient patient);
}
