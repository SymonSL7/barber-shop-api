package br.com.dio.barbershopapi.exception;

public class PhoneInUseException extends RuntimeException {

    public PhoneInUseException(String message) {
        super(message);
    }

}
