package com.iim.project.controller;

import com.iim.project.model.Anisse;
import com.iim.project.service.AnisseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anisse")
public class AnisseController {

    private final AnisseService anisseService;

    public AnisseController(AnisseService anisseService) {
        this.anisseService = anisseService;
    }

    @PostMapping
    public Anisse create(
            @RequestParam int taille,
            @RequestParam int force,
            @RequestParam int precision) {

        return anisseService.create(taille, force, precision);
    }

    @GetMapping
    public List<Anisse> getAll() {
        return anisseService.getAll();
    }

    @GetMapping("/{id}")
    public Anisse getById(@PathVariable Long id) {
        return anisseService.getById(id);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {

        anisseService.delete(id);

        return "Anisse supprimé !";
    }
}