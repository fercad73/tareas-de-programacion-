// Creamos un programa que ayude a un estudiante de escuela primaria a aprender las operaciones aritméticas básicas.

import java.util.Random;
import java.util.Scanner;

public class AritmeticaEstudiante {
    private static final Random RANDOM = new Random();
    private static final String[] COMENTARIOS_POSITIVOS = {"¡Muy bien!", "¡Excelente!", "¡Buen trabajo!", "¡Sigue así!", "¡Eres un experto en aritmética!"};
    private static final String[] COMENTARIOS_NEGATIVOS = {"No. Por favor intenta de nuevo.", "Incorrecto. Intenta una vez más.", "¡No te rindas!", "No. Sigue intentando."};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecciona el nivel de dificultad (1-20): ");
        int nivelDificultad = scanner.nextInt();
        System.out.println("Selecciona el tipo de problema aritmético a estudiar (1-5): ");
        int tipoProblema = scanner.nextInt();

        int preguntasCorrectas = 0;
        int preguntasTotales = 0;

        while (preguntasCorrectas < 10) {
            String pregunta = generarPregunta(nivelDificultad, tipoProblema);
            System.out.println(pregunta);
            scanner.nextLine();
            String respuestaUsuario = scanner.nextLine();
            String respuestaCorrecta = obtenerRespuestaCorrecta(pregunta);

            if (respuestaUsuario.equals(respuestaCorrecta)) {
                System.out.println(COMENTARIOS_POSITIVOS[RANDOM.nextInt(COMENTARIOS_POSITIVOS.length)]);
                preguntasCorrectas++;
            } else {
                System.out.println(COMENTARIOS_NEGATIVOS[RANDOM.nextInt(COMENTARIOS_NEGATIVOS.length)]);
            }

            preguntasTotales++;
        }

        double porcentajeRespuestasCorrectas = (preguntasCorrectas / (double) preguntasTotales) * 100;
        System.out.println("Has respondido correctamente a " + preguntasCorrectas + " de " + preguntasTotales + " preguntas (" + porcentajeRespuestasCorrectas + "%).");

        if (porcentajeRespuestasCorrectas < 75) {
            System.out.println("Por favor pide ayuda adicional a tu instructor.");
        } else {
            System.out.println("Felicidades, estás listo para pasar al siguiente nivel!");
        }
    }

    private static String generarPregunta(int nivelDificultad, int tipoProblema) {
        // Aquí deberás implementar la lógica para generar preguntas aritméticas aleatorias según las especificaciones del usuario.
    }

    private static String obtenerRespuestaCorrecta(String pregunta) {
        // Aquí deberás implementar la lógica para determinar la respuesta correcta a la pregunta.
    }
}