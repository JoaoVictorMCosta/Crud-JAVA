package com.example.crud.config; // Ou o pacote principal da sua aplicação

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotenvConfig {

    @Bean
    public Dotenv dotenv() {
        // Este método irá carregar o arquivo .env
        // por padrão, ele procura na raiz do projeto onde a aplicação está sendo executada.
        return Dotenv.load();
    }
}