package ec.com.corebank.banquito.models.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "CLIENTE")
public class Cliente extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENTEID")
    private Integer clienteid;

    @NotBlank
    @Column(name = "CONTRASENA", length = 30, nullable = false)
    @Size(min = 4, max = 30)
    private String contrasena;

    @NotBlank
    @Column(name = "ESTADO", length = 20, nullable = false)
    private String estado; // Esto es un String porque en la base de datos es varchar(20)

    // No es necesario tener la relación @OneToOne con Persona ya que Cliente extiende de Persona

    public Cliente() {}

    public Cliente(
        @NotBlank @Size(min = 4, max = 30) String nombre,
        @NotBlank @Size(min = 4, max = 20) String genero,
        @NotBlank Integer edad,
        @NotBlank @Size(min = 4, max = 20) String identificacion,
        @NotBlank @Size(min = 4, max = 60) String direccion,
        @NotBlank @Size(min = 4, max = 60) String telefono,
        @NotBlank @Size(min = 4, max = 20) Integer clienteid,
        @NotBlank @Size(min = 4, max = 30) String contrasena,
        @NotBlank @Size(min = 4, max = 20) String estado) {

        super(nombre, genero, edad, identificacion, direccion, telefono);
        this.clienteid = clienteid;
        this.contrasena = contrasena;
        this.estado = estado;
    }


    public Cliente(
        @NotBlank @Size(min = 4, max = 20) String identificacion,
        @NotBlank @Size(min = 4, max = 30) String nombre,
        @NotBlank @Size(min = 4, max = 60) String direccion,
        @NotBlank @Size(min = 4, max = 60) String telefono,
        @NotBlank @Size(min = 4, max = 30) String contrasena,
        @NotBlank @Size(min = 4, max = 20) String estado

        ) {

        super(nombre, identificacion, direccion, telefono);
        this.clienteid = clienteid;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public Integer getClienteid() {
        return clienteid;
    }

    public void setClienteid(Integer clienteid) {
        this.clienteid = clienteid;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    

    // Getters y setters
}