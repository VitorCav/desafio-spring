package next.school.cesar.springdasafiospring.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Client {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private int age;
    private int dependents;
    private double income;
    private String marital_status;
    private Date createAt;
    private Date updatedAt;
    
    @ManyToMany
    private List<Address> addresses;
    
    @OneToMany
    private List<Vehicle> vehicles;
    
    @OneToMany
    private List<House> houses;

}
