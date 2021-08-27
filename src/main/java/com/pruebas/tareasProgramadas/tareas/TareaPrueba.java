package com.pruebas.tareasProgramadas.tareas;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@EnableScheduling
public class TareaPrueba {

    //@Scheduled(fixedDelay = 10)
    @Scheduled(cron = "0/20 * 0 * * ?" ,zone = "America/Bogota")
    public void ejecutarHola(){
        System.out.println(LocalDateTime.now());
        System.out.println("Hola lindura");
    }
}
