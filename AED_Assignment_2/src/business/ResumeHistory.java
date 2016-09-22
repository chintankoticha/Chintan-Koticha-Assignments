/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author Chintan
 */
public class ResumeHistory {

    private ArrayList<Resume> resumeHistory;
    int flag;
    //int gender_flag;
    //int country_flag;

    public ResumeHistory() {
        resumeHistory = new ArrayList<Resume>();
    }

    public ArrayList<Resume> getResumeHistory() {
        return resumeHistory;
    }

    public void setResumeHistory(ArrayList<Resume> resumeHistory) {
        this.resumeHistory = resumeHistory;
    }

    public Resume addResume() {
        Resume resume = new Resume();
        resumeHistory.add(resume);
        return resume;
    }

    public void deleteResume(Resume r) {
        resumeHistory.remove(r);
    }

    /*public void setImagePath(String filePath) {
        this.filePath = filePath;
    }

    public String getImagePath() {
        return filePath;
    }*/
    //Methods for Graduation field
    public void setFlagValue(int flag) {
        this.flag = flag;
    }

    public int getFlagValue() {
        return flag;
    }

    /*//Methods for Gender field
    public void setGenderFlagValue(int flag)
    {
        this.gender_flag=flag;
    }
    
    public int getGenderFlagValue()
    {
        return gender_flag;
    }*/
 /*//Methods for Country field
    public void setCountryFlagValue(int flag)
    {
        this.country_flag=flag;
    }
    
    public int getCountryFlagValue()
    {
        return country_flag;
    }*/
}
