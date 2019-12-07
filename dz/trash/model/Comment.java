package dz.trash.model;

import java.util.Date;

public class Comment {
    private int id_comment ; // car un user peut ajouter plsr commentaire
    private String content ;
    private Date creation_date;
     private boolean is_enabled ;

    public Comment(int id_comment, String content, Date creation_date, boolean is_enabled) {
        this.id_comment = id_comment;
        this.content = content;
        this.creation_date = creation_date;
        this.is_enabled = is_enabled;

    }

}