
package zoo;

import java.util.Random;

/**
 *
 * @author Lecturer
 */
public class Animal {
    
    // Create some attributes 
    
    private String name;
    private int age;
    private double weight;
    private String habitat;
    private String color;
    private String diet;
    private String endangeredStatus;
    
    
//    / The constructor is our point of reference when communicating with this class

    public Animal(String name, int age, double weight, String habitat, String color, String diet, String endangeredStatus) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.habitat = habitat;
        this.color = color;
        this.diet = diet;
        this.endangeredStatus = endangeredStatus;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
        
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getEndangeredStatus() {
        return endangeredStatus;
    }

    public void setEndangeredStatus(String endangeredStatus) {
        this.endangeredStatus = endangeredStatus;
    }
    
    //Methods
        public String getBehaviour() {
        
        Random random = new Random();
        int behaviour = random.nextInt(10);
        if (behaviour >= 5) {
            return "The animal is chilling!";
        } else {
            return "The animal is agitated.";
        }
    }

    public String isHungry() {

        Random random = new Random();
        int isHungry = random.nextInt(10);
        if (isHungry >= 6) {
            return "The animal is hungry!";
        } else {
            return "The animal is not hungry.";
        }
    }

    public String getHealth() {
        
        Random random = new Random();
        int isHungry = random.nextInt(10);
        if (isHungry >= 4) {
            return "The animal is healthy!";
        } else {
            return "The animal needs some attention.";
        }  
    }
    
    
}
