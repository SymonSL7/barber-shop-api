package br.com.dio.barbershopapi.exception;

public class ScheduleInUseException extends RuntimeException {

    public ScheduleInUseException(String message) {
        super(message);
    }

}
