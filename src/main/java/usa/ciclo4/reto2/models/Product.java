
package usa.ciclo4.reto2.models;

import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "cleaningproducts")

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Product {

    @Id
    private String reference;

    private String brand;
    private String category;
    private String description;
    private boolean availability;
    private double price;
    private int quantity;
    private String photography;
    
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
    
    public boolean getAvailability() {
        return availability;
    }
    
}

