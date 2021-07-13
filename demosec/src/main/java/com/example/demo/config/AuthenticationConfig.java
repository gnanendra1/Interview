/*
 * package com.example.demo.config;
 * 
 * import org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.http.HttpMethod; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.core.userdetails.UserDetailsService; import
 * org.springframework.security.provisioning.InMemoryUserDetailsManager;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class AuthenticationConfig extends
 * WebSecurityConfigurerAdapter {
 * 
 * protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests().antMatchers(HttpMethod.GET,
 * "/**").authenticated().and().antMatcher("").build(); }
 * 
 * @Bean public UserDetailsService userDetailsService() throws Exception {
 * InMemoryUserDetailsManager provider = new InMemoryUserDetailsManager();
 * provider.createUser(
 * User.withDefaultPasswordEncoder().username("gnana").password("gnana").roles(
 * "USER").build()); return provider; }
 * 
 * protected void configure(HttpSecurity http) throws Exception {
 * 
 * http.antMatcher("/get").authorizeRequests().anyRequest().hasRole("USER").and(
 * ).httpBasic(); }
 * 
 * }
 */