// Guillem Gil i Marcel Guitart

import java.util.Scanner;

public class ESCAPEROOM2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        int maxIntents = 3;
        int solucio1 = 32;
        int solucio2 = 725;
        boolean prova1Superada = false;
        boolean prova2Superada = false;

        // ---------- HISTÒRIA ----------
        System.out.println("=====================================");
        System.out.println("   ESCAPE ROOM: L'EXAMEN DE BASES DE DADES");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("Ets a l'aula d'Ilerna fent l'examen final de Bases de Dades de DAM 1.");
        System.out.println("Portes dues hores lluitant contra taules, claus primàries i SQL.");
        System.out.println("De sobte, el professor tanca la porta de l'aula amb clau:");
        System.out.println("\"Ningú no sortirà d'aquí sense haver demostrat que domina la matèria!\"");
        System.out.println();
        System.out.println("Falten poques preguntes per acabar el temps de la prova.");
        System.out.println("OBJECTIU: resol els dos últims exercicis per aconseguir el 10,");
        System.out.println("obtenir la clau digital i escapar de l'aula abans que se t'acabi el temps.");
        System.out.println("Tens 3 intents a cada exercici. Sort!");
        System.out.println();

        // ---------- PROVA 1 ----------
        System.out.println("--- EXERCI 1: EL DIAGRAMA ENTITAT-RELACIÓ ---");
        System.out.println("Al formulari d'examen apareix una seqüència de cardinalitats");
        System.out.println("de subdesenvolupament d'un model de dades:");
        System.out.println("        2  -  4  -  8  -  16  -  ?");
        System.out.println("Pista: cada valor és el doble de l'anterior.");
        System.out.println("Quin és el següent valor que falta per validar el model?");

        int intents = maxIntents;
        while (intents > 0 && !prova1Superada) {
            System.out.print("Resposta: ");
            if (sc.hasNextInt()) {
                int resposta = sc.nextInt();
                if (resposta == solucio1) {
                    prova1Superada = true;
                    System.out.println("Correcte! El model Entitat-Relació s'ha validat.");
                } else {
                    intents--;
                    System.out.println("Resposta incorrecta. Error de compilació!");
                    if (intents > 0) {
                        System.out.println("Et queden " + intents + " intents.");
                    }
                }
            } else {
                sc.next(); // descarta el que no es un numero
                intents--;
                System.out.println("Això no és un número!");
                if (intents > 0) {
                    System.out.println("Et queden " + intents + " intents.");
        }
        }
        }

        // ---------- PROVA 2 ----------
        if (prova1Superada) {
            System.out.println();
            System.out.println("--- EXERCICI 2: LA CONSULTA SQL FINAL ---");
            System.out.println("Obres el terminal per executar la darrera consulta SQL.");
            System.out.println("Per trobar el codi d'accés a la base de dades, llegeix les consultes:");
            System.out.println("  Nota 1: Primera xifra = SELECT COUNT(*) dels dies de la setmana.");
            System.out.println("  Nota 2: Segona xifra = L'únic número primer que és parell.");
            System.out.println("  Nota 3: Tercera xifra = El nombre de dits que té una mà.");
            System.out.println("Introdueix el codi d'accés (les tres xifres seguides).");

            intents = maxIntents; // cada prova comença amb 3 intents
            while (intents > 0 && !prova2Superada) {
                System.out.print("Codi: ");
                if (sc.hasNextInt()) {
                    int resposta = sc.nextInt();
                    if (resposta == solucio2) {
                        prova2Superada = true;
                        System.out.println("SELECT EXECUTAT AMB ÈXIT! Accés concedit.");
                    } else {
                        intents--;
                        System.out.println("Codi incorrecte. Error de sintaxi SQL!");
                        if (intents > 0) {
                            System.out.println("Et queden " + intents + " intents.");
                        }
                    }
                } else {
                    sc.next();
                    intents--;
                    System.out.println("Això no és un número!");
                    if (intents > 0) {
                        System.out.println("Et queden " + intents + " intents.");
        }
        }
        }
        }

        // ---------- FINAL ----------
        System.out.println();
        if (prova1Superada && prova2Superada) {
            System.out.println("Enviant el formulari d'examen...");
            System.out.println("Pantalla: \"Lliurament rebut. Nota final: 10/10!\"");
            System.out.println("El professor somriu, et dona la clau i pots sortir de l'aula de DAM 1.");
            System.out.println("*** VICTÒRIA! Has superat l'examen i has escapat d'Ilerna! ***");
        } else if (!prova1Superada) {
            System.out.println("Has exhaurit els intents en l'exercici del diagrames.");
            System.out.println("*** DERROTA: Has suspès l'examen i et toca anar a la recuperacio ***");
        } else {
            System.out.println("L'SQL ha fallat i el sistema s'ha congelat.");
            System.out.println("*** DERROTA: Se t'ha acabat el temps i t'has quedat sense lliurar l'examen! ***");
        }
    }


	}


