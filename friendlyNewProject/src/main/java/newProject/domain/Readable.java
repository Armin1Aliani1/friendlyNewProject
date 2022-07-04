package newProject.domain;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Readable extends Product {
    private int countPage;
    private String topic;

    public Readable() {
    }

    public int getCountPage() {
        return countPage;
    }

    public void setCountPage(int countPage) {
        this.countPage = countPage;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
