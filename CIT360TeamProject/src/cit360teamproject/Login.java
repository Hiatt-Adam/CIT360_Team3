package cit360teamproject;
// Generated Mar 8, 2016 11:54:47 AM by Hibernate Tools 4.3.1



/**
 * Login generated by hbm2java
 */
public class Login  implements java.io.Serializable {


     private String email;
     private String password;

    public Login() {
    }

	
    public Login(String email) {
        this.email = email;
    }
    public Login(String email, String password) {
       this.email = email;
       this.password = password;
    }
   
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


