package at.refugeescode.accountancy.persistence.repository;


import at.refugeescode.accountancy.persistence.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient save(Patient patient);
}
