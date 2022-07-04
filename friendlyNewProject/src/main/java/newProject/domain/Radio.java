package newProject.domain;

import javax.persistence.Entity;

@Entity
public class Radio extends Electronic {
    private Frequency frequency;
    private SearchType searchType;

    public Radio() {
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public SearchType getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchType searchType) {
        this.searchType = searchType;
    }

    enum SearchType {MANUAL, AUTO}

    enum Frequency {FM, AM, BOTH}
}
