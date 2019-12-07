

package dz.trash.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Challenge {
    private int id_challenge;
    private Date creation_date ;
    private int state;
    private Date starting_date;
    private Date ending_date ;
    private float latitude  ;
    private float longitude ;
    private String street;
    private String city ;
    private String zip_code ;
    private String country;
    private Set<Photo> cf;    //association one to many entre <challenge> et <photo>
    private Set<Client> participant;    //association many to many entre <challenge> et <client>
    private Set<Note> note;
    private Set<Comment> comment;


    public Challenge(int id_challenge, Date creation_date, int state, Date starting_date, Date ending_date, float latitude, float longitude, String street, String city, String zip_code, String country) {
        this.id_challenge = id_challenge;
        this.creation_date = creation_date;
        this.state = state;
        this.starting_date = starting_date;
        this.ending_date = ending_date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.street = street;
        this.city = city;
        this.zip_code = zip_code;
        this.country = country;
        cf= new HashSet<Photo>();
        participant= new HashSet<Client>();
        note = new HashSet<Note>();
        comment = new HashSet<Comment>();

    }

    public Challenge() {
        cf= new HashSet<Photo>();
        participant= new HashSet<Client>();
        note = new HashSet<Note>();
        comment = new HashSet<Comment>();

    }


    //association  one to many unidirectionnelle entre challenge et photo  (composition)

    public void addPhoto(Photo pic){
        if( !getPhoto().contains(pic) ) getPhoto().add(pic); }

    public void removePhoto(Photo pic){
        if(getPhoto().contains(pic)) getPhoto().remove(pic); }

    public Set<Photo> getPhoto() {
        return cf;
    }

    public void setPhoto(Set<Photo> cf) {
        this.cf = cf;
    }


    //association (participants) many to many unidirectionnelle entre challenge et client

    public void addClient(Client c){ if(
            !getClient().contains(c) ) getClient().add(c);  }

    public void removeClient(Client c){
        if(getClient().contains(c)) getClient().remove(c); }

    public Set<Client> getClient() {
        return participant;
    }

    public void setClient(Set<Client> c) {
        this.participant = c;
    }

    //classe association  ==> one to many unidirectionnelle entre note et challenge

    public void addNote(Note n){
        if( !getNote().contains(n) ) getNote().add(n);
    }

    public void removeNote(Note n){
        if(getNote().contains(n)) getNote().remove(n);
    }

    public Set<Note> getNote(){
        return note;
    }

    public void setNote(Set<Note> note){
        this.note = note; }

    //classe association  ==> one to many unidirectionnelle entre comment et challenge

    public void addComment(Comment c){
        if( !getComment().contains(c) ) getComment().add(c);
    }

    public void removeComment(Comment c){
        if(getComment().contains(c)) getComment().remove(c);
    }

    public Set<Comment> getComment(){
        return comment;
    }

    public void setComment(Set<Comment> c){
        this.comment = c; }

        //la fonction de getparticipant()





}
