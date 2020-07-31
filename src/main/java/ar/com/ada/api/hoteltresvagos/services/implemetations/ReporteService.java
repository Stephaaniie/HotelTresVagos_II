package ar.com.ada.api.hoteltresvagos.services.implemetations;

import java.math.BigDecimal;

import ar.com.ada.api.hoteltresvagos.entities.Huesped;
import ar.com.ada.api.hoteltresvagos.entities.Reserva;
import ar.com.ada.api.hoteltresvagos.services.IReporteService;

public class ReporteService implements IReporteService {

	@Override
	public int getCantidadReservas(Huesped huesped) {
		return huesped.getCantidadReservas();
	}

	@Override
	public BigDecimal getTotalImporteReserva(Reserva reserva) {
		return reserva.getImporteReserva();
	}

	@Override
	public BigDecimal getTotalImportePagado(Reserva reserva) {
		return reserva.getImportePagado();
	}

	@Override
	public BigDecimal getImporteTotal(Reserva reserva) {
		return reserva.getImporteTotal();
	}
}