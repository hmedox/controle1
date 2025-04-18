package ma.emsi.controle1.entities;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import org.jetbrains.annotations.NotNull;

import java.time.LocalDate;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Donateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nom;

    @Email
    private String email;

    private String telephone;

    @NotNull
    private Double objectifMontant;

    @NotNull
    private LocalDate dateDebut;

    @NotNull
    private LocalDate dateFin;
}