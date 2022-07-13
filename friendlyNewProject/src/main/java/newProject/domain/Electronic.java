package newProject.domain;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Electronic extends Product {
    private int voltage;
    private String communicationPortal;
    private String model;

    public Electronic() {
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public String getCommunicationPortal() {
        return communicationPortal;
    }

    public void setCommunicationPortal(String communicationPortal) {
        this.communicationPortal = communicationPortal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
