package br.com.dio.barbershopapi.service.impl;

import br.com.dio.barbershopapi.entity.ScheduleEntity;
import br.com.dio.barbershopapi.repository.IScheduleRepository;
import br.com.dio.barbershopapi.service.IScheduleService;
import br.com.dio.barbershopapi.service.query.IScheduleQueryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ScheduleService implements IScheduleService {

    private final IScheduleRepository repository;
    private final IScheduleQueryService queryService;

    @Override
    public ScheduleEntity save(final ScheduleEntity entity) {
        queryService.verifyIfScheduleExists(entity.getStartAt(), entity.getEndAt());

        return repository.save(entity);
    }

    @Override
    public void delete(final long id) {
        queryService.findById(id);
        repository.deleteById(id);
    }
}
