package entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCliente;

	@Column(length = 100)
	private String nome;
	@Column(length = 14)
	private String cpf;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<Compra> compras;

	public Cliente() {
	}

	public Cliente(Integer idCliente, String nome, String cpf) {
		this.idCliente = idCliente;
		this.nome = nome;
		this.cpf = cpf;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
