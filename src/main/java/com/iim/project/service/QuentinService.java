package com.iim.project.service;

import com.iim.project.model.Quentin;
import com.iim.project.repository.QuentinRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuentinService {

    private final QuentinRepository quentinRepository;

    public QuentinService(QuentinRepository quentinRepository) {
        this.quentinRepository = quentinRepository;
    }

    public Quentin create(int taille, int force, int precision) {

        Quentin quentin = new Quentin(taille, force, precision);

        return quentinRepository.save(quentin);
    }

    public List<Quentin> getAll() {
        return quentinRepository.findAll();
    }

    public Quentin getById(Long id) {
        return quentinRepository.findById(id).orElse(null);
    }

    public void delete(Long id) {
        quentinRepository.deleteById(id);
    }
}