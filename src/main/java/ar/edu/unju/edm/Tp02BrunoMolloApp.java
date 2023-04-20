package ar.edu.unju.edm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp02BrunoMolloApp {

    public static void main(String[] args) {
        System.setProperty("server.port","8097");
        SpringApplication.run(Tp02BrunoMolloApp.class, args);
    }

}