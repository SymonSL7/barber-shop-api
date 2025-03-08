package br.com.dio.barbershopapi.service;

import br.com.dio.barbershopapi.entity.ScheduleEntity;

public interface IScheduleService {

    ScheduleEntity save(final ScheduleEntity entity);

    void delete(final long id);

}
