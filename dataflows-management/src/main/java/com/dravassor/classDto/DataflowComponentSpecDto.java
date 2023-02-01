package com.dravassor.classDto;

public class DataflowComponentSpecDto {


	private Long id;
    private String name;
    private boolean started;

    public DataflowComponentSpecDto() {
		super();
	}

	public DataflowComponentSpecDto(Long id, String name, boolean started) {
		super();
		this.id = id;
		this.name = name;
		this.started = started;
	}
	
	public Long getId() {
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

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}
	
}

