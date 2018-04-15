package at.refugeescode.accountancy.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Invoice {
    @Id
    @GeneratedValue
    private Long id;
    private Double cost;
    private LocalDateTime lastTimeUsed;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public LocalDateTime getLastTimeUsed() {
        return lastTimeUsed;
    }

    public void setLastTimeUsed(LocalDateTime lastTimeUsed) {
        this.lastTimeUsed = lastTimeUsed;
    }
}
