package newProject.domain;

import javax.persistence.Entity;

@Entity
public class Tv extends Electronic {
    private int inch;
    private Quality quality;

    public Tv() {
    }

    public int getInch() {
        return inch;
    }

    public void setInch(int inch) {
        this.inch = inch;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    enum Quality {HD, FULL_HD, UHD}
}
