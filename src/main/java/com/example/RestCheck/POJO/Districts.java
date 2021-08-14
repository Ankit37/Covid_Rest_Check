package com.example.RestCheck.POJO;

import javax.persistence.Column;

public class Districts {

	@Column(name="Delta")
	private Delta delta;
	
	@Column(name="Delta7")
	private Delta7 delta7;
	
	
	public Delta getDelta() {
		return delta;
	}
	public void setDelta(Delta delta) {
		this.delta = delta;
	}
	public Delta7 getDelta7() {
		return delta7;
	}
	public void setDelta7(Delta7 delta7) {
		this.delta7 = delta7;
	}
	
}
