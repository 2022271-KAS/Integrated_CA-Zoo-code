package zoo;

/**
 *
 * @author Lecturer
 */
public class Mammal extends Animal{
    
    // Once the Mammal extends the animal class
    // it will inherent the animal class attributes
    // we can use to create new animal types 
    // with the parent class attributes
    
    // Create a Dog name: Flix,    2,         12.5,         Home 
    public Mammal(String name, int age, double weight, String habitat, String color, String diet, String endangeredStatus) {
        super(name, age, weight, habitat, color, diet, endangeredStatus);
    }

}
