package Servicios;

import Entidades.Curso;

import java.util.Scanner;

public class CursoServicio {

    private Scanner scanner = new Scanner(System.in);

    public CursoServicio() {
    }

//    d) Método cargarAlumnos(): 
//    este método le permitirá al usuario ingresar
//    los alumnos que asisten a las clases. Nosotros nos encargaremos de
//    almacenar esta información en un arreglo e iterar con un bucle,
//    solicitando en cada repetición que se ingrese el nombre de cada alumno.
    
    public void cargarAlumnos(Curso curso) {
        
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.println("Ingresa el nombre del alumno " + (i + 1) + ":");
            curso.getAlumnos()[i] = scanner.nextLine();
        }
        
    }

    /*e) Método crearCurso(): 
    el método crear curso, le pide los valores de
    los atributos al usuario y después se le asignan a sus respectivos
    atributos para llenar el objeto Curso. En este método invocamos al
    método cargarAlumnos() para asignarle valor al atributo alumnos.*/
    
    public Curso crearCurso() {
    Curso curso = new Curso();

    System.out.println("Ingresa el nombre del curso:");
    curso.setNombreCurso(scanner.nextLine());

    System.out.println("Ingresa la cantidad de horas por dia:");
    curso.setCantidadHorasPorDia(scanner.nextInt());
    scanner.nextLine(); // consume the newline

    System.out.println("Ingresa la cantidad de días por semana:");
    curso.setCantidadDiasPorSemana(scanner.nextInt());
    scanner.nextLine(); // consume the newline

    System.out.println("Ingresa el turno:");
    curso.setTurno(scanner.nextLine());

    System.out.println("Ingresa el precio por hora:");
    curso.setPrecioPorHora(scanner.nextDouble());
    scanner.nextLine(); // consume the newline

    cargarAlumnos(curso);

    return curso;
}


    //    f) Método calcularGananciaSemanal(): 
//    este método se encarga de calcular la ganancia 
//    en una semana por curso. Para ello, se deben
//    multiplicar la cantidad de horas por día, el precio por hora, la
//    cantidad de alumnos y la cantidad de días a la semana que se repite el encuentro.
    
    public double calcularGananciaSemanal(Curso curso) {
        return curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getAlumnos().length * curso.getCantidadDiasPorSemana();
    }
}
