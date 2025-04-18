package ma.emsi.controle1.controllers;

import ma.emsi.controle1.entities.Donateur;
import ma.emsi.controle1.services.DonateurService;
import jakarta.validation.Valid;
import ma.emsi.controle1.dto.DonateurResume;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/donateurs/actifs")
public class DonateurController {

    private final DonateurService donateurService;

    public DonateurController(DonateurService donateurService) {
        this.donateurService = donateurService;
    }

    @GetMapping
    public List<Donateur> getAll() {
        return donateurService.getAll();
    }

    @GetMapping("/actifs")
    public List<DonateurResume> getActifs() {
        return donateurService.getActifs();
    }

    // Méthode pour créer un Donateur
    @PostMapping
    public ResponseEntity<Donateur> createDonateur(@Valid @RequestBody Donateur donateur) {
        Donateur createdDonateur = donateurService.save(donateur);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdDonateur);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        donateurService.delete(id);
    }
}
