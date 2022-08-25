package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;
    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;


    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id=nextId;
        nextId++;
    }
    public Job(String name,Employer employer,Location location,PositionType positionType,CoreCompetency coreCompetency){
        this();
        this.name =name;
        this.employer=employer;
        this.location=location;
        this.positionType=positionType;
        this.coreCompetency=coreCompetency;

    }
    public String checkIfEmpty(){
        if(name.isEmpty()){
            return "Data not available";
        }
        else {
            return name;
        }
    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id ;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public int getId() {
        return id;
    }

    public String getName() {

        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Employer getEmployer() {
        if(employer.toString().isEmpty()){
            employer.setValue("Data not available");
        }
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        if(location.toString().isEmpty()){
            location.setValue("Data not available");
        }
        return location;
    }
    public PositionType getPositionType() {
        if(positionType.toString().isEmpty()){
            positionType.setValue("Data not available");
        }
        return positionType;
    }
    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }
    public void setLocation(Location location) {
        this.location = location;
    }
    public CoreCompetency getCoreCompetency() {
        if(coreCompetency.toString().isEmpty()){
            coreCompetency.setValue("Data not available");
        }
        return coreCompetency;
    }
    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString() {
        return "\nID: "+ id+"\n"+
                "Name: " +name+"\n"+
                "Employer: " +employer+"\n"+
                "Location: " +location+"\n"+
                "Position Type: " +positionType+"\n"+
                "Core Competency: "+coreCompetency+"\n";
    }
}