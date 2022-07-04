package newProject.domain;

import javax.persistence.Entity;

@Entity
public class Book extends Readable {
    private String authorName;

    public Book() {
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
