package cit360teamproject;

 
// Generated Mar 8, 2016 11:54:47 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Eaglereqs generated by hbm2java
 */
public class Eaglereqs  implements java.io.Serializable {


     private short requirementnumber;
     private String requirement;
     private Date datecompleted;

    public Eaglereqs() {
    }

	
    public Eaglereqs(short requirementnumber) {
        this.requirementnumber = requirementnumber;
    }
    public Eaglereqs(short requirementnumber, String requirement, Date datecompleted) {
       this.requirementnumber = requirementnumber;
       this.requirement = requirement;
       this.datecompleted = datecompleted;
    }
   
    public short getRequirementnumber() {
        return this.requirementnumber;
    }
    
    public void setRequirementnumber(short requirementnumber) {
        this.requirementnumber = requirementnumber;
    }
    public String getRequirement() {
        return this.requirement;
    }
    
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }
    public Date getDatecompleted() {
        return this.datecompleted;
    }
    
    public void setDatecompleted(Date datecompleted) {
        this.datecompleted = datecompleted;
    }




}


