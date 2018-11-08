package tech.bts.CriminalHuntArtificialIntelligenceCHAI.model;

public class Suspect {

    private String name;
    private int age;
    private double height;
    private double weight;
    private String hairColor;
    private String eyeColor;
    private boolean male;

    private Suspect() {

    }

    private Suspect(String name, int age, double height, double weight, String hairColor, String eyeColor, boolean male) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.hairColor = hairColor;
        this.eyeColor = eyeColor;
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

    public String getHairColor() {
        return hairColor;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isMale() {
        return male;
    }


    // Inner class
    // Are usually static
    // If it isn't static, you need to create an object of the enclosing class first.
    public static class Builder {

        // One solution for the builder is to declare all the fields again
        // private String name;
        // private String eyeColor;
        // etc.

        // Another solution is to have a field of the class you want to create
        // Create an empty object in the constructor
        // In the build method, just return that field
        private Suspect suspect;

        public Builder() {
            this.suspect = new Suspect();
        }

        // We return the same builder for method chaining
        public Builder name(String name) {
            suspect.name = name;
            return this;
        }

        public Builder eyeColor(String eyeColor) {
            this.suspect.eyeColor = eyeColor;
            return this;
        }

        public Builder hairColor(String hairColor) {
            this.suspect.hairColor = hairColor;
            return this;
        }

        public Builder age(int age) {
            this.suspect.age = age;
            return this;
        }

        public Builder height(double height) {
            this.suspect.height = height;
            return this;
        }

        public Builder weight(double weight) {
            this.suspect.weight = weight;
            return this;
        }

        public Builder male(boolean male) {
            this.suspect.male = male;
            return this;
        }

        public Suspect build() {

            return this.suspect;

        }


    }

}
