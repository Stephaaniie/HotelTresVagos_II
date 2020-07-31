package ar.com.ada.api.hoteltresvagos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import ar.com.ada.api.hoteltresvagos.entities.Reserva;
import ar.com.ada.api.hoteltresvagos.entities.reportes.ReporteEstado;
import ar.com.ada.api.hoteltresvagos.entities.reportes.ReportePorHuesped;
import ar.com.ada.api.hoteltresvagos.services.ReporteService;
import ar.com.ada.api.hoteltresvagos.services.ReservaService;

@RestController
public class ReservaController {


    @Autowired
    ReporteService reporteService;

    @Autowired
    ReservaService reservaService;

    @GetMapping("/reservas")
    public List<Reserva> getHuespedes() {
    }


    @GetMapping("reservas/reportes")
    public ResponseEntity<?> getReportes() {

    }
}