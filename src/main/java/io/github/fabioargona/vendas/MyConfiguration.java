package io.github.fabioargona.vendas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@Development
public class MyConfiguration {

    @Bean
    public CommandLineRunner execute(){
        return args -> {
            System.out.println("Running development configuration");
        };

    }
}
