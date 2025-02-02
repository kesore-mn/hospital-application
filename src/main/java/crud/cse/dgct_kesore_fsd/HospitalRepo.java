package crud.cse.dgct_kesore_fsd;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepo extends JpaRepository<Patient,Integer>{
    
} 