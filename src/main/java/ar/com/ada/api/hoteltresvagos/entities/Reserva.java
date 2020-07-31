package ar.com.ada.api.hoteltresvagos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @Column(name = "reserva_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservaId;

    @Column(name = "fecha_reserva")
    private Date fechaReserva;

    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @Column(name = "fecha_egreso")
    private Date fechaEgreso;

    private int habitacion;

    @Column(name = "importe_reserva")
    private BigDecimal importeReserva;

    @Column(name = "importe_total")
    private BigDecimal importeTotal;

    @Column(name = "importe_pagado")
    private BigDecimal importePagado;

    @Column(name = "estado_id")
    private int estadoId;

    @ManyToOne
    @JoinColumn(name = "huesped_id", referencedColumnName = "huesped_id")
    private Huesped huesped;


    public void setHuesped(Huesped huesped) {
        this.huesped = huesped;
        this.huesped.getReservas().add(this);
    }

	public int getReservaId() {
		return reservaId;
	}

	public void setReservaId(int reservaId) {
		this.reservaId = reservaId;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaEgreso() {
		return fechaEgreso;
	}

	public void setFechaEgreso(Date fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}

	public int getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(int habitacion) {
		this.habitacion = habitacion;
	}

	public BigDecimal getImporteReserva() {
		return importeReserva;
	}

	public void setImporteReserva(BigDecimal importeReserva) {
		this.importeReserva = importeReserva;
	}

	public BigDecimal getImporteTotal() {
		return importeTotal;
	}

	public void setImporteTotal(BigDecimal importeTotal) {
		this.importeTotal = importeTotal;
	}

	public BigDecimal getImportePagado() {
		return importePagado;
	}

	public void setImportePagado(BigDecimal importePagado) {
		this.importePagado = importePagado;
	}

	public int getEstadoId() {
		return estadoId;
	}

	public void setEstadoId(int estadoId) {
		this.estadoId = estadoId;
	}

	public Huesped getHuesped() {
		return huesped;
	}
}
