package main.config;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.security.SpringBootWebSecurityConfiguration;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import java.util.EnumSet;

/**
 * Created by admin on 2016-06-30.
 */
@Configuration
@EnableWebSecurity

public class SecurityConfig extends WebSecurityConfigurerAdapter {


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                    .withUser("admin").password("1234").roles("ADMIN");

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                    .anonymous()
                    .and()
                .authorizeRequests()
                    .antMatchers("/admin/**").hasRole("ADMIN")
                    .antMatchers("/**").permitAll()
                    .anyRequest().authenticated()
                    .and()
                .formLogin()
                    .loginPage("/login") // 2.2 로그인 페이지로 이동시킴
                    .defaultSuccessUrl("/main", true)//성공시 이동페이지
                .permitAll();
    }
//
//    @Bean
//    public FilterRegistrationBean getSpringSecurityFilterChainBindedToError(
//            @Qualifier("springSecurityFilterChain") Filter springSecurityFilterChain ) {
//
//        FilterRegistrationBean registration = new FilterRegistrationBean();
////        registration.setFilter(springSecurityFilterChain);
////        registration.setDispatcherTypes(EnumSet.allOf(DispatcherType.class));
//        return registration;
//    }



}
