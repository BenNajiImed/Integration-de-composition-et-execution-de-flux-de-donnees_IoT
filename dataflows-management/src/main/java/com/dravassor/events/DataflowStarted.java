package com.dravassor.events;

public class DataflowStarted extends Event{

    private Long idDataflow;

    public DataflowStarted() {
        super();
    }

    public DataflowStarted(Long idDataflow) {
        super(EventType.STARTUP);
        this.idDataflow = idDataflow;
    }

    public Long getIdDataflow() {
        return idDataflow;
    }

    public void setIdDataflow(Long idDataflow) {
        this.idDataflow = idDataflow;
    }

    @Override
    public String toString() {
        return "DataflowStarted [" + super.toString() +", idDataflow=" + idDataflow + "]";
    }
    
}
