package co.edu.ue.controller;

import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class PasswordController {

    @PostMapping("/validar-contraseña")
    public Map<String, String> validarContrasena(@RequestBody Map<String, String> request) {
        String contrasena = request.get("usuariosContraseña");

        // Expresiones regulares para cada validación
        String regexMayuscula = ".*[A-Z].*";  // Para validar al menos una mayúscula
        String regexMinuscula = ".*[a-z].*";  // Para validar al menos una minúscula
        String regexNumero = ".*\\d.*";       // Para validar al menos un número
        String regexEspecial = ".*[*@#$%^&+=!].*"; // Para validar al menos un carácter especial
        String regexLongitud = ".{5,}";        // Para validar la longitud mínima de 5 caracteres

        Map<String, String> respuesta = new HashMap<>();

        // Verificar si la contraseña es válida y dar mensaje adecuado
        if (contrasena == null || contrasena.isEmpty()) {
            respuesta.put("mensaje", "Error: La contraseña no puede estar vacía.");
            respuesta.put("valida", "false");
        } else if (!contrasena.matches(regexLongitud)) {
            respuesta.put("mensaje", "Error: La contraseña debe tener al menos 5 caracteres.");
            respuesta.put("valida", "false");
        } else {
            StringBuilder mensajeError = new StringBuilder();

            if (!contrasena.matches(regexMayuscula)) {
                mensajeError.append("Debe tener al menos una letra mayúscula. ");
            }
            if (!contrasena.matches(regexMinuscula)) {
                mensajeError.append("Debe tener al menos una letra minúscula. ");
            }
            if (!contrasena.matches(regexNumero)) {
                mensajeError.append("Debe tener al menos un número. ");
            }
            if (!contrasena.matches(regexEspecial)) {
                mensajeError.append("Debe tener al menos un carácter especial (@#$%^&+=!). ");
            }

            if (mensajeError.length() > 0) {
                respuesta.put("mensaje", mensajeError.toString());
                respuesta.put("valida", "false");
            } else {
                respuesta.put("mensaje", "La contraseña es válida.");
                respuesta.put("valida", "true");
            }
        }
        

        return respuesta;
    }
}
