package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by dewi on 08.11.16.
 */

@Entity
public class Degree {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String course;
    private String schoolName;
    private String levelOfDegree;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getLevelOfDegree() {
        return levelOfDegree;
    }

    public void setLevelOfDegree(String levelOfDegree) {
        this.levelOfDegree = levelOfDegree;
    }

}
