import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int ingresado;
        do {

            Scanner opc = new Scanner(System.in);
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            System.out.println("=====================================================================================================================");
            System.out.println("||                                                                                                                 ||");
            System.out.println("||                                                                                                                 ||");
            System.out.println("||                  DIGITE UN NUMERO ENTRE 1-10 QUE TE GUSTARIA EJECUTAR                                           ||");
            System.out.println("||                  1- Herencia- Area                                                                              ||");
            System.out.println("||                  2- Herencia- ID                                                                                ||");
            System.out.println("||                  3- Herencia- Jugador                                                                           ||");
            System.out.println("||                  4- Herencia- Par o Impar                                                                       ||");
            System.out.println("||                  5- Herencia- Tabla de Multiplicar                                                              ||");
            System.out.println("||                  6- Herencia- Fibonacci                                                                         ||");
            System.out.println("||                  7- Herencia- Vehiculo                                                                          ||");
            System.out.println("||                  8- Herencia- Catedratico                                                                       ||");
            System.out.println("||                  9- Herencia- Factorial                                                                         ||");
            System.out.println("||                 10- Herencia- Año Bisiesto                                                                      ||");
            System.out.println("||                                                                                                                 ||");
            System.out.println("=====================================================================================================================");
            System.out.println("---------------------------------------------------------------------------------------------------------------------");
            ingresado = opc.nextInt();
            switch (ingresado) {
                case 1:
                    Empleado empleado1 = new Empleado("Jose", "Cayetano", 22, "Ingenieria");
                    empleado1.imprimir();
                    break;

                case 2:
                    Empleado2 empleado2 = new Empleado2("Melissa", "Ruben", 29, "Trabajadora Social", 927);
                    empleado2.imprimir2();
                    break;

                case 3:
                    Jugador jugador = new Jugador("Julio", "Lopez", 19, "9 de Area", 11.5, 9);
                    jugador.imprimir3();
                    break;

                case 4:
                    determinando Determinando = new determinando("Carolina", "Fuentes", 52, 4);
                    Determinando.Imprimir4();
                    break;

                case 5:
                    Multiplicacion multiplicacion = new Multiplicacion("Cinthia", "Fuentes", 54, 8);
                    multiplicacion.imprimir5();
                    break;

                case 6:
                    Fibonaccio fibonaccio = new Fibonaccio("Oseas", "Yuman", 19, 5);
                    fibonaccio.imprimir6();
                    break;

                case 7:
                    vehiculo Vehiculo = new vehiculo("Victor", "Nuñez", 22, "Lamborghini", "S54dadf", "300,000 KM/H");
                    Vehiculo.imprimir7();
                    break;

                case 8:
                    Catedratico catedratico = new Catedratico("Sofia", "Mejia", 20, "Programacion", 10, "7:00 a 10:00am", "Calculo I", "Futbol");
                    catedratico.imprimir8();
                    break;

                case 9:
                    factorial Factorial = new factorial("Cinthia", "Fuentes", 54, 4);
                    Factorial.imprimir9();
                    break;

                case 10:
                    Fashion fashion = new Fashion("Junnior", "Mckinsom", 23, "8.5", "Balenciaga", 2024);
                    fashion.imprimir10();
                    break;
            }


        } while (ingresado != 0);
    }
}