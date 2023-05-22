package com.example.demo.controladoresconfiguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/bienvenida").setViewName("bienvenida");
        registry.addViewController("/bienvenida/listarTodo").setViewName("moduloPlatos/listarTodo");
        registry.addViewController("/bienvenida/NuevoPlato").setViewName("moduloPlatos/NuevoPlato");
        registry.addViewController("/editar").setViewName("moduloPlatos/editarPlato");
    }
}
