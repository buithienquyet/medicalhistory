
package com.eighteengroup.medicalhistory.models;

import java.util.ArrayList;

/**
 *
 * @author Hoa
 */
public class Doctor extends User {  
    private String jobTitle; //chức vụ
    private String faculty; //khoa  

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    
    
}


