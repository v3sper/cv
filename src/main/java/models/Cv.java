package models;

import annotations.ToFile;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import comparator.ExperienceComparator;

import java.util.List;

public class Cv extends Identifiable {
    @ToFile("profile")
    @JsonIdentityReference(alwaysAsId = true)
    private Profile profile;

    @ToFile("experience")
    @JsonIdentityReference(alwaysAsId = true)
    private List<Experience> experience;

    @ToFile("experience")
    @JsonIdentityReference(alwaysAsId = true)
    private List<Experience> education;

    @ToFile("skill-container")
    @JsonIdentityReference(alwaysAsId = true)
    private SkillContainer skills;

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public List<Experience> getExperience() {
        return experience;
    }

    public void setExperience(List<Experience> experience) {
        this.experience = experience;
        this.experience.sort(new ExperienceComparator());
    }

    public List<Experience> getEducation() {
        return education;
    }

    public void setEducation(List<Experience> education) {
        this.education = education;
        this.education.sort(new ExperienceComparator());
    }

    public SkillContainer getSkills() {
        return skills;
    }

    public void setSkills(SkillContainer skills) {
        this.skills = skills;
    }
}
