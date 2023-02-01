package com.dravassor.events;

import com.dravassor.classDto.DataflowSpecDto;


public class DataflowSpecCreated extends Event{

    private DataflowSpecDto dataflowSpecDto;

    public DataflowSpecCreated() {
        super();
    }

    public DataflowSpecCreated(DataflowSpecDto dataflowSpecDto) {
        super(EventType.CREATION);
        this.dataflowSpecDto = dataflowSpecDto;
    }

    public DataflowSpecDto getDataflowSpec() {
        return dataflowSpecDto;
    }

    @Override
    public String toString() {
        return "DataflowSpecCreated [" + super.toString() + ", dataflowSpecDto=" + dataflowSpecDto + "]";
    }

    
}
