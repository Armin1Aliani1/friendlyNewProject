package newProject.domain;

import javax.persistence.Entity;

@Entity
public class Magazine extends Readable {
    private String publishingPeriod;

    public Magazine() {
    }

    public String getPublishingPeriod() {
        return publishingPeriod;
    }

    public void setPublishingPeriod(String publishingPeriod) {
        this.publishingPeriod = publishingPeriod;
    }
}
