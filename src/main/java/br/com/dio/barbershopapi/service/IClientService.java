package br.com.dio.barbershopapi.service;

import br.com.dio.barbershopapi.entity.ClientEntity;

public interface IClientService {

    ClientEntity save(final ClientEntity entity);

    ClientEntity update(final ClientEntity entity);

    void delete(final long id);

}
