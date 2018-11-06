package tech.bts.CriminalHuntArtificialIntelligenceCHAI.model;

public class Suspect {

    private String name;
    private int age;
    private double height;
    private double weight;
    private String hair;
    private String eye;
    private boolean male;

    public Suspect(String name, int age, double height, double weight, String hair, String eye, boolean male) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hair = hair;
        this.eye = eye;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getHair() {
        return hair;
    }

    public String getEye() {
        return eye;
    }

    public boolean isMale() {
        return male;
    }



}
