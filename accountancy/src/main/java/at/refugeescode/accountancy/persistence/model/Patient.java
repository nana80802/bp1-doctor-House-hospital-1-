package at.refugeescode.accountancy.persistence.model;

//import org.springframework.data.annotation.Id;
import javax.persistence.Id;
import javax.persistence.*;


@Entity
public class Patient {
    @Id
    @GeneratedValue
    private Long tableId;
    private String id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    private Invoice invoice;

    public Long getTableId() {
        return tableId;
    }

    public void setTableId(Long tableId) {
        this.tableId = tableId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoices(Invoice invoice) {
        this.invoice = invoice;
    }
}
