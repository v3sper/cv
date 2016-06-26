package models;

import annotations.ToFile;
import com.fasterxml.jackson.annotation.JsonIdentityReference;

import java.util.List;

public class SkillContainer extends Identifiable {

    @ToFile("skill")
    @JsonIdentityReference(alwaysAsId = true)
    private List<Skill> theoretical;

    @ToFile("skill")
    @JsonIdentityReference(alwaysAsId = true)
    private List<Skill> technical;

    public List<Skill> getTheoretical() {
        return theoretical;
    }

    public void setTheoretical(List<Skill> theoretical) {
        this.theoretical = theoretical;
    }

    public List<Skill> getTechnical() {
        return technical;
    }

    public void setTechnical(List<Skill> technical) {
        this.technical = technical;
    }
}
