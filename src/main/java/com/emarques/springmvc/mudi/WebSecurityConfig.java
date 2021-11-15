package com.emarques.springmvc.mudi;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

//// AULA 01.04: Implementando o Login
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//                .anyRequest()
//                .authenticated()
//            .and()
//                .httpBasic();
//    }
//
//    @Override
//    @Bean
//    public UserDetailsService userDetailsService(){
//        UserDetails user =
//                User.withDefaultPasswordEncoder()
//                        .username("joao")
//                        .password("joao")
//                        .roles("ADM")
//                        .build();
//        return new InMemoryUserDetailsManager(user);
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
                .anyRequest()
                .authenticated()
            .and()
            .formLogin(form -> form
                .loginPage("/login")
                .permitAll()
            );
    }
    @Override
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails user =
                User.withDefaultPasswordEncoder()
                        .username("maria")
                        .password("maria")
                        .roles("ADM")
                        .build();
        return new InMemoryUserDetailsManager(user);
    }
}