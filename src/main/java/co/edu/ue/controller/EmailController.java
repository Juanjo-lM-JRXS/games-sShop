package co.edu.ue.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmailController {

    @PostMapping("/email")
    public Map<String, String> validarEmail(@RequestBody Map<String, String> request) {
        String email = request.get("usuariosCorreo");

        // Expresiones regulares para validación de email
        String regexUnAt = "^[^@]+@[^@]+$";  // Para validar que solo haya un '@'
        String regexTerminaConCom = ".*\\.com$";  // Para validar que termine con '.com'

        Map<String, String> respuesta = new HashMap<>();

        // Verificar si el email es válido y dar mensaje adecuado
        if (email == null || email.isEmpty()) {
            respuesta.put("mensaje", "Error: El email no puede estar vacío.");
            respuesta.put("valido", "false");
        } else if (!email.matches(regexUnAt)) {
            respuesta.put("mensaje", "Error: El email no puede contener más de un '@'.");
            respuesta.put("valido", "false");
        } else if (!email.matches(regexTerminaConCom)) {
            respuesta.put("mensaje", "Error: El email debe terminar con '.com'.");
            respuesta.put("valido", "false");
        } else {
            respuesta.put("mensaje", "El email es válido.");
            respuesta.put("valido", "true");
        }

        return respuesta;
    }
}
