package ec.com.corebank.banquito.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Cliente extends Persona{


     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    

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

     // Constructor con parámetros
     public Cliente(String nombre, String genero, int edad, String identificacion, String direccion, String telefono,
     String clienteid, String contrasena, Boolean estado) {
     super(nombre, genero, edad, identificacion, direccion, telefono);
|    this.clienteid = clienteid;
 |   this.contrasena = contrasena;
     this.estado = estado;
    


}
