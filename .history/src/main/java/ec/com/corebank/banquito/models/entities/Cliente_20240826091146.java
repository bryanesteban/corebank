package ec.com.corebank.banquito.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Cliente")
public class Cliente extends Persona {

    @Id
    @NotBlank
    @Column(name = "clienteid", unique = true)
    @Size(min = 4, max = 20)
    private String clienteid;

    @NotBlank
    @Column(name = "contrasena")
    @Size(min = 4, max = 30)
    private String contrasena;

    @NotBlank
    @Column(name = "estado")
    private Boolean estado;

    public Cliente() {
    }

    public Cliente(
        Long idPersona,
        @NotBlank @Size(min = 4, max = 30) String nombre,
        @NotBlank @Size(min = 4, max = 20) String genero,
        @NotBlank int edad,
        @NotBlank @Size(min = 4, max = 20) String identificacion,
        @NotBlank @Size(min = 4, max = 60) String direccion,
        @NotBlank @Size(min = 4, max = 60) String telefono,
        @NotBlank @Size(min = 4, max = 20) String clienteid,
        @NotBlank @Size(min = 4, max = 30) String contrasena,
        @NotBlank Boolean estado) {

        super(idPersona, nombre, genero, edad, identificacion, direccion, telefono);
        this.clienteid = clienteid;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    // Getters and Setters

    public String getClienteid() {
        return clienteid;
    }

    public void setClienteid(String clienteid) {
        this.clienteid = clienteid;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}