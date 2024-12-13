package zoo;

/**
 *
 * @author Lecturer
 */
public class Bird extends Animal{
    
    // Once the Mammal extends the animal class
    // it will inherent the animal class attributes
    // we can use to create new animal types 
    // with the parent class attributes
    public Bird(String name, int age, double weight, String habitat, String color, String diet, String endangeredStatus){
            
            super(name, age, weight, habitat, color, diet, endangeredStatus);
    }

}
