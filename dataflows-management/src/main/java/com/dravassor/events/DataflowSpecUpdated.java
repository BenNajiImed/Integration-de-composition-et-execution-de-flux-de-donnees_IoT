package com.dravassor.events;

import com.dravassor.classDto.DataflowSpecDto;

public class DataflowSpecUpdated extends Event{

    private DataflowSpecDto dataflowSpecDto;

    public DataflowSpecUpdated() {
        super();
    }

    public DataflowSpecUpdated(DataflowSpecDto dataflowSpecDto) {
        super(EventType.UPDATE);
        this.dataflowSpecDto = dataflowSpecDto;
    }

    public DataflowSpecDto getDataflowSpecDto() {
        return dataflowSpecDto;
    }

    public void setDataflowSpecDto(DataflowSpecDto dataflowSpecDto) {
        this.dataflowSpecDto = dataflowSpecDto;
    }

    @Override
    public String toString() {
        return "DataflowSpecUpdated [" + super.toString() + ", dataflowSpecDto=" + dataflowSpecDto + "]";
    }
    
}
