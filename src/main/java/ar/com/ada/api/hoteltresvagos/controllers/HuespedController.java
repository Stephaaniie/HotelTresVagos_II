package ar.com.ada.api.hoteltresvagos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.hoteltresvagos.entities.Huesped;
import ar.com.ada.api.hoteltresvagos.services.implemetations.HuespedService;

@RestController
@RequestMapping("/huespedes")
public class HuespedController {

    @Autowired
    HuespedService huespedService;

    @GetMapping()
    public List<Huesped> findAll(@RequestParam String nombre) {
        return huespedService.findAll();
    }

    @GetMapping("/{id}")
    public Huesped findById(@PathVariable int id) {
        return huespedService.findById(id);
    }

    @PostMapping()
    public ResponseEntity<Huesped> save(@RequestBody Huesped req) {
        return new ResponseEntity<>(huespedService.save(req), HttpStatus.CREATED);
    }

    @PutMapping("{id}")
    public Huesped postHuesped(@PathVariable int id, @RequestBody Huesped req) {
        req.setHuespedId(id);
        return huespedService.save(req);
    }
    
    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        huespedService.deleteById(id);
        return "OK";
    }
}