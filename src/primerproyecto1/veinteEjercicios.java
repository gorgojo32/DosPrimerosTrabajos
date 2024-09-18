package primerproyecto1;

import java.util.Scanner;

public class veinteEjercicios {

    public static void main(String[] args) {
//Estos son los ejercicios Primeros
        Scanner scanner = new Scanner(System.in);
             System.out.println("Digite del 1 al 20 que ejercicio quiere ver: ");
             String palabras = scanner.nextLine();
             int edad= 25;
             double altura = 1.75;
             String nombre = "juan";
             boolean casado = true;
             int año = 2022;
             char letra = 'A';
             float peso = 70.5f;
             long dni = 12345678L;
             short edad2=25;
             byte nota = 8;
             String apellido = "Perez";
             boolean mayorEdad = false;
             int mes = 6;
             double salario = 2500.50;
             char sexo = 'M';
             float altura2 = 1.80f;
             long telefono = 1234567890L;
             short anio = 2020;
             byte nota2 =9;
             
             

             int ejercicio = Integer.parseInt(palabras);
             
        switch (ejercicio) {
            case 1:
                System.out.println("edad"+edad);
                break;
            case 2:
                System.out.println("altura"+altura);
                break;
            case 3:
                System.out.println("NOMBRE"+nombre);
                break;
            case 4:
                System.out.println("casado"+casado);
                break;
            case 5:
                System.out.println("año"+año);
                break;
            case 6:
               System.out.println("latra"+letra);
                break;
            case 7:
                System.out.println("peso"+peso);
                break;
            case 8:
                System.out.println("dni"+dni);
                break;
            case 9:
                System.out.println("edad"+edad2);
                break;
            case 10:
                System.out.println("nota"+nota);
                break;
            case 11:
                System.out.println("apellido"+apellido);
                break;
            case 12:
                System.out.println("mayorEdad"+mayorEdad);
                break;
            case 13:
                System.out.println("mes"+mes);
                break;
            case 14:
                System.out.println("salario"+salario);
                break;
            case 15:
                System.out.println("sexo"+sexo);
                break;
            case 16:
                System.out.println("altura2"+altura2);
                break;
            case 17:
                System.out.println("telefono"+telefono);
                break;
            case 18:
                System.out.println("anio"+anio);
                break;
            case 19:
                System.out.println("nota2"+nota2);
                break;
            case 20:
                System.out.println("hola ");
                break;
                
                
            

        }

    }
}
