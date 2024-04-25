package application.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "adoption_houses")
public class AdoptionHouse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cnpj;
    private String name;

    @OneToMany(mappedBy = "adoption_house")
    private List<Animal> animals;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    
    public long getCnpj() {
        return cnpj;
    }
    public void setCnpj(long cnpj) {
        this.cnpj = cnpj;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
