package dz.trash.model;

import javax.xml.crypto.Data;
import java.util.HashSet;
import java.util.Set;

public class Client extends User {
    private String phone_number ;
    private String android_version ;
    private Set<Challenge> cc;
    private Set<Note> note;
    private Set<Comment> comment;


    public Client() {
        super();
        cc= new HashSet<Challenge>();
        note = new HashSet<Note>();
        comment = new HashSet<Comment>();

    }

    public Client(int id_user, String last_name, String first_name, String user_name, String password, Data birthdate, String phone_number, String android_version) {
        super(id_user, last_name, first_name, user_name, password, birthdate);
        this.phone_number = phone_number;
        this.android_version = android_version;
        cc= new HashSet<Challenge>();
        note = new HashSet<Note>();
       comment = new HashSet<Comment>();

    }


    //association (owner) one to many unidirectionnelle entre challenge et client

    public void addChallenge(Challenge c){
        if( !getChallenge().contains(c) ) getChallenge().add(c); }

    public void removeChallenge(Challenge c){
        if(getChallenge().contains(c)) getChallenge().remove(c); }

    public Set<Challenge> getChallenge() {
        return cc;
    }

    public void setChallenge(Set<Challenge> cc) {
        this.cc = cc;
    }

    //classe association  ==> one to many unidirectionnelle entre note et client

    public void addNote(Note n){
        if( !getNote().contains(n) ) getNote().add(n);
    }

    public void removeNote(Note n){
        if(getNote().contains(n)) getNote().remove(n);
    }

    public Set<Note> getNote(){ return note; }
    public void setNote(Set<Note> note){ this.note = note; }

    //classe association  ==> one to many unidirectionnelle entre commentaire et client

    public void addComment(Comment c){
        if( !getComment().contains(c) ) getComment().add(c);
    }

    public void removeComment(Comment c){
        if(getComment().contains(c)) getComment().remove(c);
    }

    public Set<Comment> getComment(){ return comment; }
    public void setComment(Set<Comment> c){ this.comment = c; }










    //************************************************************************************

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getAndroid_version() {
        return android_version;
    }

    public void setAndroid_version(String android_version) {
        this.android_version = android_version;
    }

}
