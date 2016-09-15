/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Chintan
 */
public class Resume {
    
    private String firstName;
    private String lastName;
    private String streetLn1;
    private String streetLn2;
    private String city;
    private String country;
    private String affiliation;
    private String carrierObjectiveStatement;
    private String degree1;
    private String degree1Date;
    private String degree2;
    private String degree2Date;
    
    //Extra 5 of my choice
    private String totalExperience;
    private String programmingKnowledge;
    private String softwareKnownledge;
    private String emailId;
    private String contactNumber; 


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreetLn1() {
        return streetLn1;
    }

    public void setStreetLn1(String streetLn1) {
        this.streetLn1 = streetLn1;
    }

    public String getStreetLn2() {
        return streetLn2;
    }

    public void setStreetLn2(String streetLn2) {
        this.streetLn2 = streetLn2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(String affiliation) {
        this.affiliation = affiliation;
    }

    public String getCarrierObjectiveStatement() {
        return carrierObjectiveStatement;
    }

    public void setCarrierObjectiveStatement(String carrierObjectiveStatement) {
        this.carrierObjectiveStatement = carrierObjectiveStatement;
    }

    public String getDegree1() {
        return degree1;
    }

    public void setDegree1(String degree1) {
        this.degree1 = degree1;
    }

    public String getDegree1Date() {
        return degree1Date;
    }

    public void setDegree1Date(String degree1Date) {
        this.degree1Date = degree1Date;
    }

    public String getDegree2() {
        return degree2;
    }

    public void setDegree2(String degree2) {
        this.degree2 = degree2;
    }

    public String getDegree2Date() {
        return degree2Date;
    }

    public void setDegree2Date(String degree2Date) {
        this.degree2Date = degree2Date;
    }

    public String getTotalExperience() {
        return totalExperience;
    }

    public void setTotalExperience(String totalExperience) {
        this.totalExperience = totalExperience;
    }

    public String getProgrammingKnowledge() {
        return programmingKnowledge;
    }

    public void setProgrammingKnowledge(String programmingKnowledge) {
        this.programmingKnowledge = programmingKnowledge;
    }

    public String getSoftwareKnownledge() {
        return softwareKnownledge;
    }

    public void setSoftwareKnownledge(String softwareKnownledge) {
        this.softwareKnownledge = softwareKnownledge;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    //Method for saving Image filepath 
    public String filePath;
    public void setImagePath(String filePath)
    {
     this.filePath=filePath;
    }
    
    public String getImagePath()
    {
        return filePath;
    }
}