package br.com.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "hardware")
public class Hardware {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String marca;
	private String modelo;
	private String mobo;
	private int ram;
	private int hdTamanho;
	private String hdMarca;
	private String cpu;
	private int veloCpu;
	private String foto;
	
}
