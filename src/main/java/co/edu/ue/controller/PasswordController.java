package co.edu.ue.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PasswordController {

    @PostMapping("/validar-contrasena")
    public Map<String, String> validarContrasena(@RequestBody Map<String, String> request) {
        // Obtener la contraseña enviada por el usuario
        String contrasena = request.get("contrasena");

        // Expresión regular para validar la contraseña
        String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[@#$%^&+=!]).{5,}$";

        // Crear un mapa para responder al cliente
        Map<String, String> respuesta = new HashMap<>();

        // Validar la contraseña
        if (contrasena != null && contrasena.matches(regex)) {
            respuesta.put("mensaje", "La contraseña es válida.");
            respuesta.put("valida", "true");
        } else {
            respuesta.put("mensaje", "Error: La contraseña no cumple con los requisitos:\n"
                + "- Debe tener al menos 1 letra mayúscula.\n"
                + "- Debe tener al menos 1 letra minúscula.\n"
                + "- Debe tener al menos 1 carácter especial (@#$%^&+=!).\n"
                + "- Debe tener al menos 5 caracteres.");
            respuesta.put("valida", "false");
        }

        return respuesta;
    }
}