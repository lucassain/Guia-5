import java.util.Scanner;
import java.util.UUID;
import java.time.LocalDateTime;

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

                    libro1.ModificarPrecio(50);

                    libro1.ModificarStock(50);

                    System.out.println("Nuevo precio: "+libro1.getPrecio());
                    System.out.println("Nuevo stock: "+libro1.getStock());
                    System.out.println("------------------------------");

                    libro1.getNombreAutor().mostrarAutor();
                    System.out.println("------------------------------");

                    libro1.mostrarMensaje();

                    break;
                }

                case 2:{

                    Cliente cliente1=new Cliente("Franco", "franbide123@gmail.com", 30);

                    Factura factura1=new Factura(200, cliente1);

                    double montoFinal=factura1.calcularMontoFinal();

                    System.out.println(montoFinal);

                    cliente1.mostrarMensaje();

                    factura1.mostrarFactura();


                    break;
                }

                case 3:{
                    Cilindro cilindro1=new Cilindro();

                    cilindro1.mostrarCaracteristicas();

                    System.out.println("------------------------------");

                    Cilindro cilindro2=new Cilindro(2.5, 3.2);

                    cilindro2.mostrarCaracteristicas();

                    System.out.println("------------------------------");

                    System.out.println("Area del cilindro= "+cilindro2.calcularArea());
                    System.out.println("Volumen del cilindro= "+cilindro2.calcularVolumen());

                    break;
                }

                case 4:{

                    Estudiante estudiante1=new Estudiante(11111111, "Lucas", "mailLucas@gmail.com", "calle1",2025, 130000, "TUP");
                    Estudiante estudiante2=new Estudiante(22222222, "Franco", "mailFranco@gmail.com", "calle2",2024, 130000, "TUP");
                    Estudiante estudiante3=new Estudiante(33333333,"Santi", "mailSanti@gmail.com", "calle3",2026, 0, "Economia");
                    Estudiante estudiante4=new Estudiante(44444444, "Benja", "mailBenja@gmail.com", "calle4",2023, 60000, "Biologia");

                    Staff staff1=new Staff(55555555, "Julian", "mailJulian@gmail.com", "calle5", 500000, "mañana");
                    Staff staff2=new Staff(66666666, "Lucio", "mailLucio@gmail.com", "calle6", 600000, "noche");
                    Staff staff3=new Staff(77777777, "Nicolas", "mailNicolas@gmail.com", "calle7", 900000, "mañana");
                    Staff staff4=new Staff(88888888, "Claudia", "mailClaudia@gmail.com", "calle8", 999999, "noche");

                    Persona[] personas= new Persona[8];

                    personas[0] = estudiante1;
                    personas[1] = estudiante2;
                    personas[2] = estudiante3;
                    personas[3] = estudiante4;
                    personas[4] = staff1;
                    personas[5] = staff2;
                    personas[6] = staff3;
                    personas[7] = staff4;

                    contarPersonas(personas);

                    System.out.println("Total de ingresos que percibe la institución por parte de la cuota de estudiantes= "+sumarIngresosEstudiantes(personas));

                    break;
                }

                default:{
                    System.out.println("Opcion invalida. Ingrese otra opcion.");
                    break;
                }
            }

        }while (opcion!=0);

    }
    public static void contarPersonas (Persona[] personas){
        int cantidadEstudiantes=0;
        int cantidadStaff=0;

        for (int i=0;i< personas.length;i++){

            if (personas[i] instanceof Estudiante){
                cantidadEstudiantes++;
            } else if (personas[i] instanceof Staff){
                cantidadStaff++;
            }
        }
        System.out.println("Cantidad de estudiantes= "+cantidadEstudiantes);
        System.out.println("Cantidad de Staff= "+cantidadStaff);
    }

    public static int sumarIngresosEstudiantes (Persona[] personas){
        int sumaIngresos=0;

        for (int i=0;i<personas.length;i++){
            if (personas[i] instanceof Estudiante){
                Estudiante est= (Estudiante) personas[i];
                sumaIngresos+=est.getCuotaMensual();
            }
        }

        return sumaIngresos;
    }

}


