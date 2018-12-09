package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCompra;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idProduto_fk")
	private List<Produto> produtos;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCliente_fk")
	private Cliente cliente;
}
