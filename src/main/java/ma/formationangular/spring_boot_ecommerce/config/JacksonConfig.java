package ma.formationangular.spring_boot_ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule; // Pour LocalDateTime

@Configuration
public class JacksonConfig {

    @Bean
    public ObjectMapper objectMapper() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.INDENT_OUTPUT); // Optionnel : pour formater le JSON
        objectMapper.disable(SerializationFeature.FAIL_ON_EMPTY_BEANS); // Permet de sérialiser même des objets vides
        objectMapper.setDefaultPropertyInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS); // Inclut toutes les propriétés
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS); // Formate les dates comme ISO-8601
        objectMapper.registerModule(new JavaTimeModule()); // Support pour LocalDateTime
        return objectMapper;
    }
}