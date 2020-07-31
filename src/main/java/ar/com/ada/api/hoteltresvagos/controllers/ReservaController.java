package ar.com.ada.api.hoteltresvagos.controllers;

import java.math.BigDecimal;
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
import org.springframework.web.bind.annotation.RestController;

import ar.com.ada.api.hoteltresvagos.entities.Reserva;
import ar.com.ada.api.hoteltresvagos.services.implemetations.ReporteService;
import ar.com.ada.api.hoteltresvagos.services.implemetations.ReservaSevice;

@RestController
@RequestMapping("api/reservas")
public class ReservaController {

    @Autowired
    ReporteService reporteService;

    @Autowired
    ReservaSevice reservaService;

    @PostMapping()
    public ResponseEntity<Reserva> save(@RequestBody Reserva reserva){
        return new ResponseEntity<>(reserva, HttpStatus.CREATED);
    }

    @GetMapping()
    public List<Reserva> findAll() {
        return reservaService.findAll();
    }

    @GetMapping("reservas/{id}/deudas")
    public BigDecimal totalASaldar(@PathVariable("id") int id) {
        return reporteService.getImporteTotal(reservaService.findById(id));
    }

    @GetMapping("reservas/{id}/saldos")
    public BigDecimal importePadado(@PathVariable("id") int id) {
        return reporteService.getTotalImportePagado(reservaService.findById(id));
    }

    @GetMapping("reservas/{id}/precios")
    public BigDecimal importeReserva(@PathVariable("id") int id) {
        return reporteService.getTotalImporteReserva(reservaService.findById(id));
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") int id) {
        reservaService.deleteById(id);
        return "OK";
    }

    @PutMapping("/{id}")
    public Reserva modificarEmpleado(@PathVariable int id, @RequestBody Reserva reserva) {
      reserva.setReservaId(id);
      return reservaService.save(reserva);
    }
}