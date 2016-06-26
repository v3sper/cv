package models;

import annotations.ToFile;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import comparator.PositionDetailComparator;

import java.util.List;

public class Position extends Identifiable {
    @ToFile("position-detail")
    @JsonIdentityReference(alwaysAsId = true)
    private List<PositionDetail> positionDetails;
    private String responsibilities;

    public List<PositionDetail> getPositionDetails() {
        return positionDetails;
    }

    public void setPositionDetails(List<PositionDetail> positionDetails) {
        this.positionDetails = positionDetails;
        this.positionDetails.sort(new PositionDetailComparator());
    }

    public String getResponsibilities() {
        return responsibilities;
    }

    public void setResponsibilities(String responsibilities) {
        this.responsibilities = responsibilities;
    }
}
