package com.fca.biblioteca.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import java.time.LocalDate;

@Entity               // Marca esta clase como una entidad de Hibernate
@Table(name = "prestamo")  // Especifica el nombre de la tabla en la base de datos
public class Prestamo {

    @Id                        // Define que esta columna es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // La generación del ID será automática
    @Column(name = "idprestamo")  // Mapea el nombre de la columna en la base de datos
    private int idPrestamo;

    @Column(name = "idpersona")  // Mapea el nombre de la columna
    private int idPersona;        // Relación con la persona que realiza el préstamo

    @Column(name = "idlibro")    // Mapea el nombre de la columna
    private int idLibro;          // Relación con el libro prestado

    @Column(name = "fechaprestamo")  // Mapea el nombre de la columna
    private LocalDate fechaPrestamo;  // Fecha en que se realiza el préstamo

    @Column(name = "diasprestamo")   // Mapea el nombre de la columna
    private int diasPrestamo;         // Número de días que el libro estará prestado

    // Getters y Setters (puedes generarlos con un IDE o usar Lombok si prefieres)
    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }
}
