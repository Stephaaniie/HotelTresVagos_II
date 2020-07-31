package ar.com.ada.api.hoteltresvagos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.hoteltresvagos.entities.Huesped;
import ar.com.ada.api.hoteltresvagos.services.IHuespedService;


@RestController
public class HuespedController {

    @Autowired
    IHuespedService huespedService;

  
    @GetMapping("/huespedes")
    public List<Huesped> getHuespedes(@RequestParam(value = "nombre", required = false) String nombre) {
        return lh;
    }

    
    @GetMapping("/huespedes/{id}")
    public ResponseEntity<Huesped> getHuespedById(@PathVariable int id) {
    }

    @PostMapping("/huespedes")
    public ResponseEntity<?> postHuesped(@RequestBody Huesped req) {
    }

    @PutMapping("/huespedes/{id}")
    public ResponseEntity<?> postHuesped(@PathVariable int id, @RequestBody Huesped req) {
    }
    

}