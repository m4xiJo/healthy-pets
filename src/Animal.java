interface DataI { //New interface
    void setName(String name);
    void setPortion(String weight);
    void setFoodType(String FoodType);
    String getFoodType();
    String getName();
    Double getPortion();
    Integer getWeight();
}

public abstract class Animal {
    protected String name;
    protected String foodType;
    protected Double portion;
    protected Integer weight;

    Animal(String name, String weight) {
        this.name = name;
        this.weight = Integer.parseInt(weight);
    }

    /**
     *
     * @return name of the animal
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return food type that's fed to the animal
     */

    public String getFoodType() {
        return this.foodType;
    }

    /**
     *
     * @return amount of portion in grams
     */
    public Double getPortion() {
        return this.portion;
    }

    /**
     *
     * @return animal weight in grams
     */
    public Integer getWeight() {
        return this.weight;
    }
}

class Dog extends Animal implements DataI {
    Dog(String name, String weight) {
        super(name, weight);
        this.setPortion(weight);
        this.setFoodType("dog food");
    }

    /**
     *
     * @param name sets name of the dog
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     *
     * @param weight sets portion applicable for dogs (in grams)
     */
    @Override
    public void setPortion(String weight) {
        super.portion = Double.parseDouble(weight) / 100;
    }

    /**
     *
     * @param foodType sets food type applicable for the dog
     */
    @Override
    public void setFoodType(String foodType) {
        super.foodType = foodType;
    }
}

class Cat extends Animal implements DataI {
    Cat(String name, String weight) {
        super(name, weight);
        this.setPortion(weight);
        this.setFoodType("cat food");
    }

    /**
     *
     * @param name sets name of the cat
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     *
     * @param weight sets portion applicable for the cat (in grams)
     */
    @Override
    public void setPortion(String weight) {
        super.portion = Double.parseDouble(weight) / 150;
    }

    /**
     *
     * @param foodType sets food type applicable for the cat
     */
    @Override
    public void setFoodType(String foodType) {
        super.foodType = foodType;
    }

}

class Snake extends Animal implements DataI {
    Snake(String name, String weight) {
        super(name, weight);
        this.setPortion(weight);
        this.setFoodType("snake pills");
    }

    /**
     *
     * @param name sets name of the snake
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     *
     * @param weight sets portion applicable for the snake (in grams)
     */
    @Override
    public void setPortion(String weight) {
        super.portion = 20.0;
    }

    /**
     *
     * @param foodType sets food type applicable for the snake
     */
    @Override
    public void setFoodType(String foodType) {
        super.foodType = foodType;
    }
}