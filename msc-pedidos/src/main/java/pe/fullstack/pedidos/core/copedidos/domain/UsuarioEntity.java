package pe.fullstack.pedidos.core.copedidos.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="USUARIOS")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioEntity {

    @Id
    @SequenceGenerator(name = "usuario_id_generator", sequenceName = "usuario_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "usuario_id_generator")
    private Long id;

    private String username;
    private String password;
    private String name;
    private String lastname;
    private String cellphone;
    private Integer gender;
    private String email;
    private String birthDate;
    private String facebook;
}
