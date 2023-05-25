package com.example.demo.controladoresconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    protected void configure(HttpSecurity http) throws Exception {

       http.authorizeRequests()
                .antMatchers("/css/**", "/Imagenes/**", "/js/**", "/","/index", "/login","/bienvenida","/moduloPlatos/**","/rest/**","/moduloPlatos/listarTodo","/moduloPlatos/editarPlato","/moduloPlatos/NuevoPlato","/menu","/rest/menu","/menu/add")
                .permitAll()
                .antMatchers("/rest/platos/listarTodo").hasAnyRole("ADMIN","LECTOR","CREADOR","EDITOR","DEPURADOR")
                .antMatchers("/rest/platos/nuevo").hasAnyRole("ADMIN","CREADOR")
               .antMatchers("/rest/platos/eliminar").hasAnyRole("ADMIN","CREADOR")
               .antMatchers("/rest/platos/guardar").hasAnyRole("ADMIN","CREADOR","EDITOR")
               .antMatchers("/rest/menu").hasAnyRole("ADMIN","CREADOR","EDITOR")
               .antMatchers("/restauranteWeb/menu/add").permitAll()
                .anyRequest().authenticated()
                .and().formLogin().loginPage("/login").defaultSuccessUrl("/bienvenida",true).permitAll()
                .and().logout()
                .permitAll();

    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
        auth.inMemoryAuthentication().withUser("admin").password(encoder.encode("admin"))
                .roles("ADMIN")
                .and()
                .withUser("alex").password(encoder.encode("alex")).roles("LECTOR");
    }


}
