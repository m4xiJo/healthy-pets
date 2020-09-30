import javax.swing.*;

/**
 * Enumerator for storing animals
 */
enum Animals {
    Sixten(new Dog("Sixten", "5")),
    Dogge(new Dog("Dogge", "10")),
    Venus(new Cat("Venus", "5")),
    Ove(new Cat("Ove", "3")),
    Hypno(new Snake("Hypno", "1"));

    private DataI obj;
    Animals(DataI dataI) { //Pass interface into enumerator constructor and store it as local variable
        this.obj = dataI;
    }

    public DataI getObj() { //Return interface
        return obj;
    }
}

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        String msg = "";
        while (true) {
            try {
                String input = JOptionPane.showInputDialog("Which animal needs food?"); //Ask user to type animal name
                for (Animals animal : Animals.values()) { // Look through enumerator
                    if(animal.name().toLowerCase().equals(input.toLowerCase())) { //If matches
                        var obj = animal.getObj(); //Get the object reference of a matched animal
                        msg += "Name: " + obj.getName() + "\n"; //Get name and append it to message
                        msg += "Weight: " + obj.getWeight() + " grams \n"; //Get weight and append it to message
                        msg += "Food type: " + obj.getFoodType() + "\n"; //Get food type and append it to message
                        msg += "Portion: " + obj.getPortion() + " grams\n"; //Get portion and append it to message
                    }
                }
                if (msg.isEmpty()) throw new Exception("Animal was not found!"); //Throw error if nothing was appended to message
                JOptionPane.showMessageDialog(null, msg); //Show message with the found animal
                break;
            } catch (NullPointerException e) { // Go here if user decided to quit
                System.exit(0);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: " + e.getMessage()); //Show error message
            }
        }
    }
}
