package newProject.domain;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Costumer extends User {
    private String address;
    private int age;
    private String phoneNumber;

    @OneToOne(mappedBy = "costumer")
    private Cart cart;

    public Costumer() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
