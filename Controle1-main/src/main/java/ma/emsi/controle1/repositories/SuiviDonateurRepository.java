package ma.emsi.controle1.repositories;

import ma.emsi.controle1.entities.SuiviDonateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SuiviDonateurRepository extends JpaRepository<SuiviDonateur, Long> {
}