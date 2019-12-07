package dz.trash.model;

public class Note {

    private int note_value;
    private Client client;

    public Note(int note_value) {
        this.note_value = note_value;
    }

    //classe association  ==> one to many unidirectionnelle entre note et client

    public Client getClient(){ return client; }





    //***************************************************************************************************
    public int getNote_value() {
        return note_value;
    }

    public void setNote_value(int note_value) {
        this.note_value = note_value;
    }
}
