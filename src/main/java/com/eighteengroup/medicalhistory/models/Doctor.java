
package com.eighteengroup.medicalhistory.models;

import java.util.ArrayList;

/**
 *
 * @author Hoa
 */
public class Doctor extends User {  
    private String jobTitle; //chức vụ
    private String faculty; //khoa  
    private long roomId;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

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


