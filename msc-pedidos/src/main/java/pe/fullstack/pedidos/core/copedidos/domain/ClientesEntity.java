package pe.fullstack.pedidos.core.copedidos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="clientes")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ClientesEntity {

    @Id
    @SequenceGenerator(name = "clientes_id_generator", sequenceName = "clientes_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "clientes_id_generator")
    private Long clienteId;

    @Column(nullable = false)
    private String nombre;
    
    @Column(nullable = false)
    private String apellido;
    
    @Column(nullable = false)
    private String direccion;
    
    @Column(nullable = false)
    private String detarmento;
    
    @Column(nullable = false)
    private String provincia;
    
    
    @Column(nullable = false)
    private String distrito;
    
    @Column(nullable = false)
    private String celular;
    
    @Column(nullable = false)
    private String correo;
    
    @Column(nullable = false)
    private String documento;
}
