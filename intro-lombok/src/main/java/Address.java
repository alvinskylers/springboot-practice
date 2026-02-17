import lombok.*;

@Getter // generates getters for each field
@Setter // generates setters for each field
@ToString // generates a toString() method
@NoArgsConstructor // generates a no argument constructor
@AllArgsConstructor // generates a constructor with all class fields
public class Address {
    private int houseNumber;
    private String street;
    private String city;
    private String postcode;
    private String state;
    private String country;

}
