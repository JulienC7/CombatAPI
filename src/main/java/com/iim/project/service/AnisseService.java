package com.iim.project.service;

import com.iim.project.model.Anisse;
import com.iim.project.repository.AnisseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnisseService {

    private final AnisseRepository anisseRepository;

    public AnisseService(AnisseRepository anisseRepository) {
        this.anisseRepository = anisseRepository;
    }

    public Anisse create(int taille, int force, int precision) {

        Anisse anisse = new Anisse(taille, force, precision);

        return anisseRepository.save(anisse);
    }

    public List<Anisse> getAll() {
        return anisseRepository.findAll();
    }

    public Anisse getById(Long id) {
        return anisseRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        anisseRepository.deleteById(id);
    }
}