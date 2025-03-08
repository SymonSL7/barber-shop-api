package br.com.dio.barbershopapi.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ScheduleAppointmentMonthResponse(
        @JsonProperty("year")
        int year,
        @JsonProperty("month")
        int month,
    List<ClientScheduleAppointmentResponse> scheduledAppointments
) {}