package com.dravassor.events;

public class DataflowStopped extends Event{

    private Long idDataflow;

    public DataflowStopped() {
        super();
    }

    public DataflowStopped(Long idDataflow) {
        super(EventType.STOP);
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
        return "DataflowStopped [" + super.toString() +", idDataflow=" + idDataflow + "]";
    }
    
}
