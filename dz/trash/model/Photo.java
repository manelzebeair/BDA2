package dz.trash.model;

import java.util.Date;

public class Photo {
    private int id_photo ;
    private String path ;
    private Date creation_date ;

    public Photo(int id_photo, String path, Date creation_date) {
        this.id_photo = id_photo;
        this.path = path;
        this.creation_date = creation_date;
    }

    public int getId_photo() {
        return id_photo;
    }

    public void setId_photo(int id_photo) {
        this.id_photo = id_photo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }
}
