package pe.fullstack.pedidos.core.copedidos.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="productos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductosEntity  implements Cloneable{

    @Id
    @SequenceGenerator(name = "productos_id_generator", sequenceName = "productos_id_seq", allocationSize = 1)
    @GeneratedValue(generator = "productos_id_generator")
    private Long productoId;

    @JoinColumn(name = "categoriaId", referencedColumnName = "categoriaId")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CategoriasEntity categoria;
       
    private Double precio;
    
    private String nombre;
    
    private String descripcion;
    
    private int stock;
    
    @Override
    public ProductosEntity clone() throws CloneNotSupportedException {
    
    	ProductosEntity nueva= new ProductosEntity (this.productoId,this.categoria,this.precio, this.nombre,this.descripcion,this.stock);
        return nueva;
    }
}
