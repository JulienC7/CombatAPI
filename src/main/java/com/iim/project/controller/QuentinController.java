package com.iim.project.controller;

import com.iim.project.model.Quentin;
import com.iim.project.service.QuentinService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quentin")
public class QuentinController {

    private final QuentinService quentinService;

    public QuentinController(QuentinService quentinService) {
        this.quentinService = quentinService;
    }

    @PostMapping
    public Quentin create(
            @RequestParam int taille,
            @RequestParam int force,
            @RequestParam int precision) {

        return quentinService.create(taille, force, precision);
    }

    @GetMapping
    public List<Quentin> getAll() {
        return quentinService.getAll();
    }

    @GetMapping("/{id}")
    public Quentin getById(@PathVariable Long id) {
        return quentinService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {

        quentinService.delete(id);

        return "Quentin supprimé !";
    }
}