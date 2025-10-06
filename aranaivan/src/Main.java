import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducción
        System.out.println("¡Bienvenido a la aventura de la araña!");
        System.out.print("Introduce el nombre de tu araña: ");
        String nombre = scanner.nextLine();

        // Variables para estadísticas
        int distanciaRecorrida = 0;
        boolean vida=true;
        int decisionesTomadas=0;

        System.out.println("\nLa valiente araña " + nombre + " inicia su viaje en el aula de ASIR 1.");
        System.out.println("Tras mirar a su alrededor, debe decidir su primer movimiento...");

        // DECISIÓN 1
        System.out.println("\n(1) Subir por la pared hasta el techo.");
        System.out.println("(2) Caminar por el suelo hacia la mesa del profesor.");
        System.out.print("Elige (1 o 2): ");
        int decision1 = scanner.nextInt();
        decisionesTomadas+=1;
        if (decision1 == 1) {
            distanciaRecorrida += 2;
            System.out.println("\n" + nombre + " sube ágilmente por la pared y observa todo desde arriba.");
        } else {
            distanciaRecorrida += 3;
            System.out.println("\n" + nombre + " camina lentamente hacia la mesa, esquivando mochilas.");
        }

        // DECISIÓN 2
        System.out.println("\nA continuación, " + nombre + " encuentra dos caminos:");
        System.out.println("(1) Ir hacia una mochila abierta.");
        System.out.println("(2) Esconderse bajo una silla.");
        System.out.print("Elige (1 o 2): ");
        int decision2 = scanner.nextInt();
        decisionesTomadas+=1;
        if (decision2 == 1) {
            distanciaRecorrida += 2;
            System.out.println("\nDentro de la mochila, " + nombre + " encuentra una galleta olvidada.");
        } else {
            distanciaRecorrida += 1;
            System.out.println("\n" + nombre + " se esconde bajo una silla, evitando las miradas curiosas.");
        }

        // DECISIÓN 3
        System.out.println("\nMás adelante, " + nombre + " debe decidir:");
        System.out.println("(1) Subir a la mesa del profesor.");
        System.out.println("(2) Escapar por la ventana abierta.");
        System.out.println("(3) Ir por la puerta.");
        System.out.println("(4) Arrimarte a un alumno.");
        System.out.println("Elige (1, 2, 3 o 4): ");
        int decision3 = scanner.nextInt();
        decisionesTomadas+=1;
        String finalHistoria = "";

        if (decision3 == 1) {
            distanciaRecorrida += 1;
            if (decision1 == 1 && decision2 == 1) {
                finalHistoria = nombre + " trepa hasta la mesa del profesor con su tesoro de galleta, pero un estudiante lo descubre y lo expulsa fuera del aula.";
                vida = true;
            } else {
                finalHistoria = nombre + " llega a la mesa del profesor y se siente poderoso, contemplando su reino desde lo alto.";
                vida = true;
            }
        } else if (decision3 == 2) {
            distanciaRecorrida += 5;
            if (decision1 == 2 && decision2 == 2) {
                finalHistoria = nombre + " escapa por la ventana, pero un pájaro lo ve y decide que será su almuerzo.";
                vida = false;
            } else {
                finalHistoria = nombre + " logra escapar por la ventana y comienza una nueva vida en el patio.";
                vida = true;
            }
        }
        else if (decision3 == 3) {
            distanciaRecorrida += 5;
            System.out.println("El alumno se asusta y mata a "+nombre);
            vida = false;
        }
        else {
            distanciaRecorrida += 5;
            System.out.println("Los alumnos aplastan a "+nombre+" contra la puerta.");
            vida=false;
        }

        // Final
        System.out.println("\n=== FINAL DE LA HISTORIA ===");
        System.out.println(finalHistoria);

        // Resumen de estadísticas
        System.out.println("\n=== ESTADÍSTICAS DE " + nombre.toUpperCase() + " ===");
        System.out.println("Distancia total recorrida: " + distanciaRecorrida + " metros.");
        System.out.println("¿Sobrevive?: " + (vida));
        System.out.println("Decisiones tomadas: "+decisionesTomadas);

        scanner.close();
    }
}
