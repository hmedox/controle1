package ma.emsi.controle1.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuiviDonateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "donateur_id")
    private Donateur campagne;

    @NotBlank
    private String nomDonateur;

    @NotNull
    private Double montant;

    @NotNull
    private LocalDate date;
}
