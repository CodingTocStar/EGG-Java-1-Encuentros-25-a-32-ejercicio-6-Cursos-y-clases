/*
Para ello, crearemos una clase entidad llamada Curso, cuyos atributos
serán: 
    1) nombreCurso, 
    2) cantidadHorasPorDia, 
    3) cantidadDiasPorSemana,
    4) turno (mañana o tarde), 
    5) precioPorHora y 
    6) alumnos. Donde alumnos es un 
        arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
        nombres de cada alumno. 

A continuación, se implementarán los siguientes métodos:
a) Un constructor por defecto.
b) Un constructor con todos los atributos como parámetro.
c) Métodos getters y setters de cada atributo.
 */
package Entidades;

/**
 *
 * @author MiriamNahuel
 */
public class Curso {

    private String nombreCurso;
    private int cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String turno;
    private double precioPorHora;
    private String[] alumnos;

    //CONSTRUCTORES
    public Curso() {
        this.nombreCurso = "";
        this.cantidadHorasPorDia = 0;
        this.cantidadDiasPorSemana = 0;
        this.turno = "";
        this.precioPorHora = 0.0;
        this.alumnos = new String[5];
    }

    public Curso(String nombreCurso, int cantidadHorasPorDia, int cantidadDiasPorSemana, String turno, double precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.turno = turno;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }

    //GETTER & SETTER
    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public void setCantidadHorasPorDia(int cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioPorHora() {
        return precioPorHora;
    }

    public void setPrecioPorHora(double precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}
