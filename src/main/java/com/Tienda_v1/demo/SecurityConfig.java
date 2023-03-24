package com.Tienda_v1.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    
    //Se define los usuarios del sistema en formato de memoria.
    @Bean
    public UserDetailsService users(){
      UserDetails admin = User.builder() //construir un usuario//  
              .username("juan")
              .password("{noop}123")//noop, el texto no esta encriptado//
              .roles("USER","VENDEDOR","ADMIN") //Mayuscula 100pre//
              .build();
      
      UserDetails vendedor = User.builder() //construir un usuario//  
              .username("rebeca")
              .password("{noop}456")//noop, el texto no esta encriptado//
              .roles("USER","VENDEDOR") //Mayuscula 100pre//
              .build();
      
       UserDetails usuario = User.builder() //construir un usuario//  
              .username("pedro")
              .password("{noop}789") //noop, el texto no esta encriptado//
              .roles("USER") //Mayuscula 100pre//
              .build();
       return new InMemoryUserDetailsManager(usuario,vendedor,admin);
    }
    
    @Bean 
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
      http
              .authorizeHttpRequests((requests) -> requests
              
              .requestMatchers("/",
                      "/index",
                      "/errores/**",
                      "/webjars/**" ).permitAll()
              
             .requestMatchers("/articulo/nuevo","/articulo/guardar",
                     "/articulo/modificar/**", "articulo/eliminar/**")
             .hasRole("ADMIN")
              );
      return http.build();
    }
}
