public class Animal {
    
    private String name;

    // private double height;

    private int weight;

    private String sound;


    public void setName(String newName) {
        this.name = newName;
    }
    public String getName() {
        return name;
    }

    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            this.weight = newWeight;
        } else {
            System.out.println("weight must be bigger than zero");
        }
    }
    public int getWeight() {
        return weight;
    }

    public void setSound(String setSound) {
        this.sound = setSound;
    }
    public String getSound() {
        return sound;
    }




}