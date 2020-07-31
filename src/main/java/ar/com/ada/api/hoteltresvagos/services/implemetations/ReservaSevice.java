package ar.com.ada.api.hoteltresvagos.services.implemetations;

import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.ada.api.hoteltresvagos.entities.Reserva;
import ar.com.ada.api.hoteltresvagos.excepciones.ResourceNotFoundException;
import ar.com.ada.api.hoteltresvagos.repos.ReservaRepository;
import ar.com.ada.api.hoteltresvagos.services.IReservaService;

@Service
public class ReservaSevice implements IReservaService {

    private final ReservaRepository reservaRepository;

    public ReservaSevice(ReservaRepository reservaRepository){
        this.reservaRepository = reservaRepository;
    }

    @Override
	public List<Reserva> findAll() {
		return reservaRepository.findAll();
	}

	
	@Override
	public Reserva findById(int id) throws ResourceNotFoundException {
		return  reservaRepository.findById(id).orElseThrow(
            () -> new ResourceNotFoundException("model with id " + id + " not found"));
	}

	@Override
	public Reserva save(Reserva reserva) {
		return reservaRepository.save(reserva);
	}

	@Override
	public void delete(Reserva reserva) {
		this.deleteById(reserva.getReservaId());
	}

	@Override
	public void deleteById(int id) {
		if (!reservaRepository.existsById(id)){
            throw new ResourceNotFoundException("model with id " + id + " not found");
        }
        reservaRepository.deleteById(id);
	}

	@Override
	public Long count() {
		return reservaRepository.count();
	}
    
}