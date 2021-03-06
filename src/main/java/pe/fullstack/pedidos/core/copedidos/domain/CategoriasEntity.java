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
@Table(name="categorias")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class CategoriasEntity {

    @Id
    @SequenceGenerator(name = "categorias_id_generator", sequenceName = "categorias_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "categorias_id_generator")
    private Long categoriaId;

    @Column(nullable = false)
    private String nombre;

}
