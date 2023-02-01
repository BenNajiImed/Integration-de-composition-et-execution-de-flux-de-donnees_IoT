package com.dravassor.classDto;

import java.util.Objects;

import javax.persistence.MappedSuperclass;

import com.dravassor.domain.ComponentType;

@MappedSuperclass
public abstract class ProducerSpecDto extends DataflowComponentSpecDto {

	protected ComponentType componentType = ComponentType.PRODUCER;
    protected String output;

	public ProducerSpecDto() {
		super();
	}

	public ProducerSpecDto(Long id, String name, boolean started, String output) {
		super(id, name, started);
		this.output = output;
	}
	
	@Override
	public String toString() {
		return "ProducerSpecDto [output=" + output + "]";
	}
	
	public ComponentType getComponentType() {
		return componentType;
	}

	public void setComponentType(ComponentType componentType) {
		this.componentType = componentType;
	}

	public String getOutput() {
		return output;
	}
	
	public void setOutput(String output) {
		this.output = output;
	}



}
