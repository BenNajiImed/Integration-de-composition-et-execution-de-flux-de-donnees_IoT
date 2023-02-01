package com.dravassor.events;

public class DataflowSpecDeleted extends Event{
    private Long idDataflow;

    public DataflowSpecDeleted() {
        super();
    }

    public DataflowSpecDeleted(Long idDataflow) {
        super(EventType.DELETION);
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
        return "DataflowSpecDeleted [" + super.toString() + ", idDataflow=" + idDataflow + "]";
    }
    
}
