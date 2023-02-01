package com.dravassor.classDto;

import java.util.List;

public class DataflowSpecDto {

	private Long id;
    private boolean shared;
    private boolean started;
    private boolean activated;
    private List<DataflowComponentSpecDto> dataflowComponentDto;

    public DataflowSpecDto() {
		super();
	}

	public DataflowSpecDto(Long id, boolean shared, boolean started, boolean activated,List<DataflowComponentSpecDto> dataflowComponentDto) {
		
		super();
		this.id = id;
		this.shared = shared;
		this.started = started;
		this.activated = activated;
		this.dataflowComponentDto = dataflowComponentDto;
	}

    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isShared() {
		return shared;
	}

	public void setShared(boolean shared) {
		this.shared = shared;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public List<DataflowComponentSpecDto> getDataflowComponentDto() {
		return dataflowComponentDto;
	}

	public void setDataflowComponentDto(List<DataflowComponentSpecDto> dataflowComponentDto) {
		this.dataflowComponentDto = dataflowComponentDto;
	}

}
