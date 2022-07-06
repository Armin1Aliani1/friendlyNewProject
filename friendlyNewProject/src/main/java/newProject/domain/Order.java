package newProject.domain;

import newProject.base.BaseEntity;

import javax.persistence.Entity;
import java.time.ZonedDateTime;

@Entity
public class Order extends BaseEntity {
    private ZonedDateTime orderDate;
    private Status status;

    public Order() {
    }

    public ZonedDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(ZonedDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    enum Status {DONE, WAITING}
}
