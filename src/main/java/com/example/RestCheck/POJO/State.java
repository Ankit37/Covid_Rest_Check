package com.example.RestCheck.POJO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class State {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;

	@Column(name = "Districts")
	private Districts districts;

	@Column(name = "Delta7")
	private Delta7 delta7;

	@Column(name = "Meta")
	private Meta meta;

	@Column(name = "Total")
	private Total total;

	
	@OneToMany(targetEntity = Delta.class, mappedBy = "State", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@Column(name = "Delta")
	private List<Delta> delta;

	public Districts getDistricts() {
		return districts;
	}

	public void setDistricts(Districts districts) {
		this.districts = districts;
	}

	


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Delta> getDelta() {
		return delta;
	}

	public void setDelta(List<Delta> delta) {
		this.delta = delta;
	}

	public Delta7 getDelta7() {
		return delta7;
	}

	public void setDelta7(Delta7 delta7) {
		this.delta7 = delta7;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public Total getTotal() {
		return total;
	}

	public void setTotal(Total total) {
		this.total = total;
	}

}
