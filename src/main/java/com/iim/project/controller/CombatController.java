package com.iim.project.controller;

import com.iim.project.service.CombatService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/combat")
public class CombatController {

    private final CombatService combatService;

    public CombatController(CombatService combatService) {
        this.combatService = combatService;
    }

    @PostMapping
    public Map<String, Object> combattre(
            @RequestParam Long anisseId,
            @RequestParam Long quentinId) {

        return combatService.combattre(anisseId, quentinId);
    }
}