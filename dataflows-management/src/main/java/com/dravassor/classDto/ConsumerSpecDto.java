package com.dravassor.classDto;

import java.util.Objects;

import javax.persistence.MappedSuperclass;

import com.dravassor.domain.ComponentType;

@MappedSuperclass
public abstract class ConsumerSpecDto extends DataflowComponentSpecDto {

	protected ComponentType componentType = ComponentType.CONSUMER;
    protected String input;

	public ConsumerSpecDto() {
		super();
	}

	public ConsumerSpecDto(Long id, String name, boolean started) {
		super(id, name, started);
	}

	public ComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(ComponentType componentType) {
		this.componentType = componentType;
	}

	public String getInput() {
		return input;
	}
	
	public void setInput(String input) {
		this.input = input;
	}



}
