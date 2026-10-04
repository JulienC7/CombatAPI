package com.iim.project.service;

import com.iim.project.model.Anisse;
import com.iim.project.model.Quentin;
import com.iim.project.repository.AnisseRepository;
import com.iim.project.repository.QuentinRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CombatService {

    private final AnisseRepository anisseRepository;
    private final QuentinRepository quentinRepository;

    public CombatService(
            AnisseRepository anisseRepository,
            QuentinRepository quentinRepository) {

        this.anisseRepository = anisseRepository;
        this.quentinRepository = quentinRepository;
    }

    public Map<String, Object> combattre(Long anisseId, Long quentinId) {

        Anisse anisse = anisseRepository.findById(anisseId)
                .orElseThrow(() -> new RuntimeException("Anisse introuvable"));

        Quentin quentin = quentinRepository.findById(quentinId)
                .orElseThrow(() -> new RuntimeException("Quentin introuvable"));

        int scoreAnisse = anisse.frapper();
        int scoreQuentin = quentin.frapper();

        String vainqueur;

        if (scoreAnisse > scoreQuentin) {
            vainqueur = "Anisse";
        } else if (scoreQuentin > scoreAnisse) {
            vainqueur = "Quentin";
        } else {
            vainqueur = "Egalite";
        }

        Map<String, Object> resultat = new HashMap<>();

        resultat.put("anisseId", anisse.getId());
        resultat.put("scoreAnisse", scoreAnisse);

        resultat.put("quentinId", quentin.getId());
        resultat.put("scoreQuentin", scoreQuentin);

        resultat.put("vainqueur", vainqueur);

        return resultat;
    }
}