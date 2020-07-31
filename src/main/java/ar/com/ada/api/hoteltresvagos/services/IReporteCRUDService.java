package ar.com.ada.api.hoteltresvagos.services;

import java.math.BigDecimal;

import ar.com.ada.api.hoteltresvagos.entities.Reserva;

public interface IReporteCRUDService <T> {

    int getCantidadReservas(Reserva reserva);

    BigDecimal getTotalImporteReserva(Reserva reserva);

    BigDecimal getTotalImportePagado(Reserva reserva);

    BigDecimal getImporteTotal(Reserva reserva);
}