package org.msarmiento.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("====== Creando la instancia de la clase Alumno =====");
        Alumno alumno = new Alumno();
        alumno.setNombre("Miguel");
        alumno.setApellido("Sarmiento");
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematicas(4.9);

        System.out.println("====== Creando la instancia de la clase AlumnoInternacional =====");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Grifin");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematicas(6.5);

        System.out.println("====== Creando la instancia de la clase Profesor =====");
        Profesor profesor = new Profesor();
        profesor.setNombre("Lucia");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemáticas");

        System.out.println("===== - =====");
        System.out.println(alumno.getNombre() + " " + alumno.getApellido());

        System.out.println(alumnoInt.getNombre() + " " + alumnoInt.getApellido() +
                " " + alumnoInt.getPais());

        System.out.println("Profesor " + profesor.getAsignatura() + " : " +
                profesor.getNombre() +
                " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " Es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}
