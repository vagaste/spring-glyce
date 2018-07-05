package co.simplon.glycelife.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")

public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Aliment> aliments = new ArrayList<>();

	public Category() {

	}

	public Category(long id) {
		this.id = id;
	}

	public Category(String name) {
		this.name = name;
	}

	public Category(long id, String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Aliment> getAliments() {
		return aliments;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", nb d'aliments= " + aliments.size() + "]";
	}

}