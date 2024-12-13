package co.edu.ue.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userManager() {
        List<UserDetails> users = List.of(User.withUsername("client").password("{noop}12345").roles("USER").build(),
                User.withUsername("admin").password("{noop}123456").roles("ADMIN").build());
        return new InMemoryUserDetailsManager(users);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(cus -> cus.disable()).authorizeHttpRequests(auth -> auth

                        .requestMatchers("/swagger-ui/", "/v3/api-docs/", "/swagger-resources/", "/webjars/").permitAll()

                        //usuario
                        .requestMatchers(HttpMethod.POST, "/nuevo-usuario").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/lista").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/actualiza").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/activos").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/delete/{id}").hasRole("ADMIN")

                        //Plataforma
                        .requestMatchers(HttpMethod.POST, "/guardar-plataforma").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/lista").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/activos").hasAnyRole("USER", "ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/actualizar").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/delete/{id}").hasRole("ADMIN")

                        //ordenes detalles
                        .requestMatchers(HttpMethod.POST, "/guardar-ordenDetalle").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/lista").hasAnyRole("USER", "ADMIN")

                        //ordenes
                        .requestMatchers(HttpMethod.POST, "/guardarOrden").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/lista").hasAnyRole("USER", "ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/actualiza/{id}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/eliminar/{id}").hasRole("ADMIN")

                        //videojuegos
                        .requestMatchers(HttpMethod.POST, "/nuevo-videojuego").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.GET, "/lista").hasAnyRole("USER", "ADMIN")
                        .requestMatchers(HttpMethod.PUT, "/videojuego/{id}").hasRole("ADMIN")
                        .requestMatchers(HttpMethod.DELETE, "/elimina/{id}").hasRole("ADMIN")
            .httpBasic(Customizer.withDefaults()).formLogin(login -> login.permitAll());
        return http.build();
    }
}// Fin de la clase SecurityConfig

/*package co.edu.ue.security;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public InMemoryUserDetailsManager userManager() {
		List<UserDetails> users = List.of(
				User.withUsername("client").password("{noop}12345").roles("USERS").build(),
				User.withUsername("admin").password("{noop}123456").roles("ADMINS").build());
		return new InMemoryUserDetailsManager(users);
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(cus -> cus.disable())
				.authorizeHttpRequests(aut -> aut.requestMatchers(HttpMethod.POST, "/datos").hasAnyRole("ADMINS")
						// .requestMatchers(HttpMethod.DELETE,"/datos/**").hasAnyRole("ADMINS","OTHER")
						.requestMatchers(HttpMethod.GET, "/lista").authenticated()
						.requestMatchers(HttpMethod.GET, "/lista").hasAnyRole("USERS")
						.requestMatchers(HttpMethod.GET, "/lista").hasAnyRole("USERS", "ADMINS")
						.requestMatchers(HttpMethod.PUT, "/lista").hasAnyRole("ADMINS"1
				).httpBasic(Customizer.withDefaults());
		return http.build();
	}
}*/
