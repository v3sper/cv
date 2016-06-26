package models;

import annotations.ToFile;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import comparator.PositionComparator;

import java.util.List;

public class Experience extends Identifiable {
    private String company;
    private String timePeriod;

    @ToFile("position")
    @JsonIdentityReference(alwaysAsId = true)
    private List<Position> positions;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public List<Position> getPositions() {
        return positions;
    }

    public void setPositions(List<Position> positions) {
        this.positions = positions;
        this.positions.sort(new PositionComparator());
    }
}
