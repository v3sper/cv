package models;

public class Skill extends Identifiable {
    private String name;
    private Integer rating;
    private Integer maxRating;

    public Skill() {
        maxRating = 7;
    }

    public Integer getMaxRating() {
        return maxRating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
