package com.poliformas.warehouse.web.forms;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class MarkForm {
    @Size(min=1, max=25)
    @NotNull
	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	

}
