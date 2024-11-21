package com.losiotecnicos.frostchef.config;


import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

// Configuración de CORS para permitir solicitudes de todos los orígenes

@Configuration
public class CORS {

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                // Permite solicitudes de todos los orígenes
                registry.addMapping("/**")
                        .allowedOrigins("http://localhost:8080", "https://frostchef-edge-api-production.up.railway.app",
                                "http://frostchef-edge-api-production.up.railway.app",
                                "https://frostchef-edge-api-production.up.railway.app") // o '*' para todos los orígenes

                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS")
                        .allowedHeaders("*")
                        .allowCredentials(true);
            }
        };
    }

    @ControllerAdvice
    public class GlobalExceptionHandler {
        @ResponseStatus(HttpStatus.OK)
        @RequestMapping(method = RequestMethod.OPTIONS)
        public void handleOptionsRequest(HttpServletResponse response) {
            response.setHeader("Access-Control-Allow-Origin", "*");
            response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
            response.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
        }
    }

}

