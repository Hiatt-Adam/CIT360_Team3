package cit360teamproject;

 
// Generated Mar 8, 2016 11:54:47 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Badgereqs generated by hbm2java
 */
public class Badgereqs  implements java.io.Serializable {


     private short reqnumber;
     private String reqdetails;
     private Date reqcompleteddate;

    public Badgereqs() {
    }

	
    public Badgereqs(short reqnumber) {
        this.reqnumber = reqnumber;
    }
    public Badgereqs(short reqnumber, String reqdetails, Date reqcompleteddate) {
       this.reqnumber = reqnumber;
       this.reqdetails = reqdetails;
       this.reqcompleteddate = reqcompleteddate;
    }
   
    public short getReqnumber() {
        return this.reqnumber;
    }
    
    public void setReqnumber(short reqnumber) {
        this.reqnumber = reqnumber;
    }
    public String getReqdetails() {
        return this.reqdetails;
    }
    
    public void setReqdetails(String reqdetails) {
        this.reqdetails = reqdetails;
    }
    public Date getReqcompleteddate() {
        return this.reqcompleteddate;
    }
    
    public void setReqcompleteddate(Date reqcompleteddate) {
        this.reqcompleteddate = reqcompleteddate;
    }




}


