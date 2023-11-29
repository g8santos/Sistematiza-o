package com.aula.entregadores.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_entregadores")
public class EntregadorModel implements Serializable{
private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String veiculo;
	private Integer matricula;
	private Double capacidadecarga;
	private String nome;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVeículo() {
		return veiculo;
	}
	public void setTitulo(String veiculo) {
		this.veiculo = veiculo;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public Double getCapacidadecarga() {
		return capacidadecarga;
	}
	public void setCapacidadecarga(Double capacidadecarga) {
		this.capacidadecarga = capacidadecarga;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
