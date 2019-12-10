package com.wstutorial.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    // Protecting the urls with a role-based access.
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers("/protected").hasRole("USER")
                .antMatchers("/admin").hasRole("ADMIN");
    }

    // The user credentials are stored in the memory. Only for testing purposes
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("user").password("{noop}secret").roles("USER");
        auth.inMemoryAuthentication().withUser("admin").password("{noop}supersecret").roles("ADMIN");
    }

}
