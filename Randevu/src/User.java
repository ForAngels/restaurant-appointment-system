/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author onurc
 */
class User {
    private int sno;
    private String firstname,lastname,phonenumber,numberofpeople,timerange;
    
    public User (int sno,String firstname, String lastname, String phonenumber, String numberofpeople, String timerange)
    {
        this.sno=sno;
        this.firstname=firstname;
        this.lastname=lastname;
        this.phonenumber=phonenumber;
        this.numberofpeople=numberofpeople;
        this.timerange=timerange;
        
    }
    public int getsno(){
        return sno;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public String getphonenumber(){
        return phonenumber;
    }
    public String getnumberofpeople(){
        return numberofpeople;
    }
    public String gettimerange(){
        return timerange;
    }
}
