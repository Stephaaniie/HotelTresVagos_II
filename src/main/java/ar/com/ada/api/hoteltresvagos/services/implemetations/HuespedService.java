package ar.com.ada.api.hoteltresvagos.services.implemetations;

import java.util.List;

import ar.com.ada.api.hoteltresvagos.entities.Huesped;
import ar.com.ada.api.hoteltresvagos.excepciones.ResourceNotFoundException;
import ar.com.ada.api.hoteltresvagos.repos.HuespedRepository;
import ar.com.ada.api.hoteltresvagos.services.IHuespedService;

public class HuespedService implements IHuespedService {

    private final HuespedRepository huespedRepository;

    public HuespedService(HuespedRepository hRepository) {
        this.huespedRepository  = hRepository;
    }

	@Override
	public List<Huesped> findAll() {
		return huespedRepository.findAll();
	}

	@Override
	public Huesped findById(int id) throws ResourceNotFoundException {
		return  huespedRepository.findById(id).orElseThrow(
            () -> new ResourceNotFoundException("model with id " + id + " not found"));
	}

	@Override
	public Huesped save(Huesped huesped) {
		return huespedRepository.save(huesped);
	}

	@Override
	public void delete(Huesped huesped) {
		this.deleteById(huesped.getHuespedId());
	}

	@Override
	public void deleteById(int id) {
		if (!huespedRepository.existsById(id)){
            throw new ResourceNotFoundException("model with id " + id + " not found");
        }
        huespedRepository.deleteById(id);
	}

	@Override
	public Long count() {
		return huespedRepository.count();
	}
}