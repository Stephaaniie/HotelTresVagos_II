package ar.com.ada.api.hoteltresvagos.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import ar.com.ada.api.hoteltresvagos.entities.Reserva;


@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Integer> {

}
