package org.theoliverlear.learn.streams;

import org.theoliverlear.learn.abstractions.constant.OfficerTitle;

public class AcmOfficer {
    //============================-Variables-=================================
    String name;
    OfficerTitle officerTitle;
    int[] startEndYear;
    //===========================-Constructors-===============================
    public AcmOfficer() {
        this.name = "";
        this.officerTitle = OfficerTitle.PRESIDENT;
        this.startEndYear = new int[2];
    }
    public AcmOfficer(String name, OfficerTitle officerTitle, int[] startEndYear) {
        this(name, officerTitle, startEndYear[0], startEndYear[1]);
    }
    public AcmOfficer(String name, OfficerTitle officerTitle, int startYear, int endYear) {
        this.name = name;
        this.officerTitle = officerTitle;
        this.startEndYear = new int[2];
        this.startEndYear[0] = startYear;
        this.startEndYear[1] = endYear;
    }
    //-------------------------Get-Tenure-String------------------------------
    public String getTenureString() {
        return String.format("%s, %s (%d - %d)%n",
                             this.name,
                             this.officerTitle.title,
                             this.startEndYear[0],
                             this.startEndYear[1]);
    }
    //----------------------------Is-President--------------------------------
    public boolean isPresident() {
        return this.officerTitle == OfficerTitle.PRESIDENT;
    }
    //=============================-Getters-==================================
    public OfficerTitle getOfficerTitle() {
        return this.officerTitle;
    }
    public String getName() {
        return this.name;
    }
    //=============================-Setters-==================================
    public void setName(String name) {
        this.name = name;
    }
}
