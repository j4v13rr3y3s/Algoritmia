package proyect;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Proyect {

    public static String linea;
    public static String name;
    ArrayList var1 = new ArrayList();

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public static void create() {
        try {
            FileWriter output = new FileWriter("C:\\Users\\ANGELA XIMENA\\Desktop\\Algoritmmia\\Proyect\\src\\proyect\\ans.txt");
            output.close();
        } catch (IOException ex) {
            System.out.println("Un error ha ocurrido");
        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void assign() {
        Random rnd = new Random();
        try {
            FileWriter output = new FileWriter("C:\\Users\\ANGELA XIMENA\\Desktop\\Algoritmmia\\Proyect\\src\\proyect\\" + "test.txt");
            for (int i = 0; i < 800; i++) {
                output.write((char) (rnd.nextInt(65) + 62) + ",");
            }
            output.close();
        } catch (IOException ex) {
            System.out.println("Un error ha ocurrido");

        }
    }
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void sort() throws FileNotFoundException, IOException {
        File file = new File("C:\\Users\\ANGELA XIMENA\\Desktop\\Algoritmmia\\Proyect\\src\\proyect\\test.txt");
        FileWriter output = new FileWriter("C:\\Users\\ANGELA XIMENA\\Desktop\\Algoritmmia\\Proyect\\src\\proyect\\tmp.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((linea = reader.readLine()) != null) {
            List<String> list = new ArrayList<>(Arrays.asList(linea.split(",")));
            Collections.sort(list);
            for (int i = 0; i < list.size(); i++) {
                output.write(list.get(i) + ",");
            }
            output.close();
        }
    }

    public static void rem_doubles() throws IOException {

    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        File file = new File("C:\\Users\\ANGELA XIMENA\\Desktop\\Algoritmmia\\Proyect\\src\\proyect\\comandos.txt");
        BufferedReader reader = new BufferedReader(new FileReader(file));
        while ((linea = reader.readLine()) != null) {
            String[] palabras = linea.split(",");

            if (1 < 2) {
                for (String n : palabras) {
                    if (n.equals("create")) {
                        create();
                    }
                }
                for (String n : palabras) {
                    if (n.equals("assign")) {
                        assign();
                    }
                }
                for (String n : palabras) {
                    if (n.equals("sort")) {
                        sort();
                    }
                }
                for (String n : palabras) {
                    if (n.equals("rem_doubles")) {
                        rem_doubles();
                    }
                }
            }

            if (2 < 3) {

                for (String n : palabras) {
                    if (n.equals("assign")) {
                        assign();
                    }
                }
                for (String n : palabras) {
                    if (n.equals("create")) {
                        create();
                    }
                }
                for (String n : palabras) {
                    if (n.equals("sort")) {
                        sort();
                    }
                }

                for (String n : palabras) {
                    if (n.equals("rem_doubles")) {
                        rem_doubles();
                    }
                }
            }
        }
    }
}
