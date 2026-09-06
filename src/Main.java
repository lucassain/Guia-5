import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int opcion;

        do {
            System.out.println("0 para salir");
            System.out.println("Ejercicio 1: ");
            System.out.println("Ejercicio 2: ");
            System.out.println("Ejercicio 3: ");
            System.out.println("Ejercicio 4: ");
            System.out.println("Ingrese una opcion: ");
            opcion=entrada.nextInt();

            switch (opcion){
                case 0:{
                    System.out.println("Cerrando programa...");

                    break;
                }

                case 1:{
                    Autor autor1=new Autor("Joshua", "Bloch", "joshua@email.com", 'M');

                    System.out.println("Datos de "+autor1.getNombre()+":");
                    autor1.mostrarAutor();

                    System.out.println("------------------------------");

                    Libro libro1=new Libro("Efective Java", 450, 150, autor1);

                    System.out.println("Datos de "+libro1.getTitulo()+":");
                    libro1.mostrarLibro();


                    break;
                }

                default:{
                    System.out.println("Opcion invalida. Ingrese otra opcion.");
                    break;
                }
            }

        }while (opcion!=0);

    }
}