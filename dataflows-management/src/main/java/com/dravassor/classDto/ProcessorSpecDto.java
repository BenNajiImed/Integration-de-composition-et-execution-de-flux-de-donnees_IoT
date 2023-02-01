package com.dravassor.classDto;

import javax.persistence.MappedSuperclass;

import com.dravassor.domain.ComponentType;

@MappedSuperclass
public abstract class ProcessorSpecDto extends DataflowComponentSpecDto {

	protected ComponentType componentType = ComponentType.PROCESSOR;
    protected String input;
    protected String output;

	public ProcessorSpecDto() {
		super();
	}

	public ProcessorSpecDto(Long id, String name, boolean started, String input, String output) {
		super(id, name, started);
		this.input = input;
        this.output = output;
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

	public String getOutput() {
		return output;
	}

	public void setOutput(String output) {
		this.output = output;
	}
	

  

}
