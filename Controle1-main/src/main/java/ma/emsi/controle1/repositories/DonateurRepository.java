package ma.emsi.controle1.repositories;
import ma.emsi.controle1.entities.Donateur;
import org.springframework.data.jpa.repository.JpaRepository;
import ma.emsi.controle1.dto.DonateurResume;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface DonateurRepository extends JpaRepository<Donateur, Long> {
    List<DonateurResume> findByDateFinAfter(LocalDate date);
    Optional<Donateur> findByEmail(String email);
}