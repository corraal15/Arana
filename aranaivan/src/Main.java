import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introducción
        System.out.println("¡Bienvenido a la aventura de la araña!");
        System.out.print("Introduce el nombre de tu araña: ");
        String nombre = scanner.nextLine();

        int distanciaRecorrida = 0;
        int decisionesTomadas = 0;
        boolean vida = true;
        String finalHistoria = "";

        System.out.println("\nLa pequeña araña " + nombre + " despierta en una esquina del aula de ASIR 1...");
        System.out.println("Debe decidir su primer movimiento:");

        // DECISIÓN 1
        System.out.println("\n(1) Subir por la pared hasta el techo.");
        System.out.println("(2) Caminar por el suelo hacia la mesa del profesor.");
        System.out.print("Elige (1 o 2): ");
        int d1 = scanner.nextInt();
        decisionesTomadas++;

        if (d1 == 1) {
            distanciaRecorrida += 2;
            System.out.println("\n" + nombre + " sube ágilmente por la pared y observa todo desde lo alto.");

            // DECISIÓN 2
            System.out.println("\nDesde el techo ve dos opciones:");
            System.out.println("(1) Bajar sobre la cabeza de un alumno.");
            System.out.println("(2) Lanzarse hacia una mochila abierta.");
            System.out.print("Elige (1 o 2): ");
            int d2 = scanner.nextInt();
            decisionesTomadas++;

            if (d2 == 1) {
                distanciaRecorrida += 1;
                System.out.println("\n" + nombre + " desciende lentamente sobre el cabello del alumno...");

                // DECISIÓN 3
                System.out.println("\nEl alumno empieza a rascarse, " + nombre + " debe decidir:");
                System.out.println("(1) Escapar hacia el pupitre.");
                System.out.println("(2) Quedarse quieto y esperar.");
                System.out.print("Elige (1 o 2): ");
                int d3 = scanner.nextInt();
                decisionesTomadas++;

                if (d3 == 1) {
                    distanciaRecorrida += 2;
                    System.out.println("\n" + nombre + " corre hacia el pupitre.");
                    // DECISIÓN 4
                    System.out.println("\nEn el pupitre hay una galleta y un vaso de agua.");
                    System.out.println("(1) Comer galleta.");
                    System.out.println("(2) Beber agua.");
                    System.out.print("Elige (1 o 2): ");
                    int d4 = scanner.nextInt();
                    decisionesTomadas++;

                    if (d4 == 1) {
                        finalHistoria = nombre + " se da un festín con la galleta, vive feliz entre las migas.";
                        vida = true; // FINAL 1
                    } else {
                        finalHistoria = nombre + " cae en el vaso y se ahoga lentamente.";
                        vida = false; // FINAL 2
                    }

                } else { // d3 == 2
                    finalHistoria = nombre + " permanece inmóvil... pero el alumno lo ve y lo aplasta sin piedad.";
                    vida = false; // FINAL 3
                }

            } else { // d2 == 2
                distanciaRecorrida += 2;
                System.out.println("\n" + nombre + " aterriza dentro de la mochila.");

                // DECISIÓN 3
                System.out.println("\nDentro hay un portátil y un bocadillo viejo.");
                System.out.println("(1) Esconderse en el bocadillo.");
                System.out.println("(2) Subir al portátil.");
                System.out.print("Elige (1 o 2): ");
                int d3 = scanner.nextInt();
                decisionesTomadas++;

                if (d3 == 1) {
                    finalHistoria = nombre + " se mete en el bocadillo y encuentra un hogar cálido... hasta que el dueño se lo come.";
                    vida = false; // FINAL 4
                } else {
                    finalHistoria = nombre + " se posa sobre el portátil y se convierte en la mascota del informático.";
                    vida = true; // FINAL 5
                }
            }

        } else { // d1 == 2
            distanciaRecorrida += 3;
            System.out.println("\n" + nombre + " avanza por el suelo, esquivando mochilas.");

            // DECISIÓN 2
            System.out.println("\nEncuentra dos lugares donde refugiarse:");
            System.out.println("(1) Debajo de la mesa del profesor.");
            System.out.println("(2) Dentro de una zapatilla olvidada.");
            System.out.print("Elige (1 o 2): ");
            int d2 = scanner.nextInt();
            decisionesTomadas++;

            if (d2 == 1) {
                distanciaRecorrida += 1;
                System.out.println("\n" + nombre + " se esconde bajo la mesa del profesor.");

                // DECISIÓN 3
                System.out.println("\nEl profesor deja caer un bolígrafo cerca. ¿Qué hace " + nombre + "?");
                System.out.println("(1) Subir por el pantalón del profesor.");
                System.out.println("(2) Escapar hacia la puerta.");
                System.out.print("Elige (1 o 2): ");
                int d3 = scanner.nextInt();
                decisionesTomadas++;

                if (d3 == 1) {
                    finalHistoria = nombre + " trepa por el profesor, quien grita del susto y sale corriendo. La araña reina el aula.";
                    vida = true; // FINAL 6
                } else {
                    finalHistoria = nombre + " corre hacia la puerta... pero un alumno entra justo en ese momento.";
                    vida = false; // FINAL 7
                }

            } else { // d2 == 2
                distanciaRecorrida += 1;
                System.out.println("\n" + nombre + " entra en la zapatilla.");

                // DECISIÓN 3
                System.out.println("\nHuele mal, pero hay calor. De pronto, alguien se la pone...");
                System.out.println("(1) Morder el pie para escapar.");
                System.out.println("(2) Quedarse dentro.");
                System.out.print("Elige (1 o 2): ");
                int d3 = scanner.nextInt();
                decisionesTomadas++;

                if (d3 == 1) {
                    finalHistoria = nombre + " muerde al alumno y escapa por la ventana, libre y heroico.";
                    vida = true; // FINAL 8
                } else {
                    finalHistoria = nombre + " se queda quieto... y muere aplastado dentro del zapato.";
                    vida = false; // FINAL 9 (ajuste para tener 8 finales, se elimina uno anterior)
                }
            }
        }

        // Mostrar resumen
        System.out.println("\n=== FINAL DE LA HISTORIA ===");
        System.out.println(finalHistoria);

        System.out.println("\n=== ESTADÍSTICAS DE " + nombre.toUpperCase() + " ===");
        System.out.println("Distancia total recorrida: " + distanciaRecorrida + " metros.");
        System.out.println("¿Sobrevive?: " + vida);
        System.out.println("Decisiones tomadas: " + decisionesTomadas);

        scanner.close();
    }
}
