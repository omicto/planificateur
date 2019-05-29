package com.planificateur.eventplanner.controllers.rest;

import com.planificateur.eventplanner.models.Local;
import com.planificateur.eventplanner.service.LocalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController @RequestMapping("api")
public class LocalController {
    @Autowired
    LocalesService localesService;

    @GetMapping("places")
    List<Local> findAll(){
        return localesService.findAll();
    }

    @PostMapping("/places/new")
    Local save(Local l){
        return localesService.save(l);
    }

    @DeleteMapping("/places/{idLocal}")
    void delete(@PathVariable Long idLocal){
        localesService.deleteById(idLocal);
    }

    @PutMapping("/places/{idLocal}")
    Local update(@PathVariable Long idLocal, Local nuevo){
        return localesService.update(idLocal, nuevo);
    }
}
