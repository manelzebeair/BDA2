package dz.trash.model;

import javax.xml.crypto.Data;

public class Admin extends User {
    private  String email ;

    public Admin() {
    super();
    }


    public Admin(int id_user, String last_name, String first_name, String user_name, String password, Data birthdate, String email) {
        super(id_user, last_name, first_name, user_name, password, birthdate);
        this.email = email;
    }








    //******************************************************************************************

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    //les fonction deleteclient()  et   disabledchallenge()
}
