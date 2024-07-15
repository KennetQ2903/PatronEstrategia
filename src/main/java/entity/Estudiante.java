package entity;

import lombok.Data;

@Data
public class Estudiante {
    private String nombre;
    private String carnet;

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", carnet='" + carnet + '\'' +
                '}';
    }
}
