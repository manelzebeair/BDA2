package dz.trash.jdbc;
import java.sql.*;
//import java.lang.Exception;
public class Connexion {

    public  Connection getConnection(){
        //create jdbc obj and load class
        Connection con=null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
        String USER = "trashAdmin";
        String PASS = "manel";

        try {
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("helloooooooooo");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (Connection) con;
    }
    public  void closeConnection(Connection con)  {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("impossible de fermer la connexion");
                e.printStackTrace();
            }
        }
    }
    //-------------------------------avec la methode main -----------------------------------------------
    /*public static void main(String[] arg) throws Exception {
        //create jdbc obj and load class
            Class.forName("oracle.jdbc.driver.OracleDriver");

          String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";
        String USER = "trashAdmin";
         String PASS = "manel";
        Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

        //create statement obj--------------------------
        // Statement stm = con.createStatement();
        //String sql ="INSERT INTO voyageur"+" VALUES(7,'ali','brahim','1-1-1995',2)";

        //prepared statement ------------------------
        // String sql ="INSERT INTO voyageur VALUES(?,'?','?','?',?)";
        //PreparedStatement pstmt =con.prepareStatement(sql);
        //voyageur v = new voyageur(7,"ali","brahim","1/1/1995",2);
        // pstmt.setInt(1,v.getId());
        //pstmt.setString(2, v.getNom());
        //pstmt.setString(3, v.getPrenom());

        //execute the query----------------------------
        // stm.executeUpdate(sql);

        //executer une requete select --------------------------------------
        // ResultSet rs= stm.executeQuery("select id, nom, prenom from agence.voyageur");
        //print database table records
        // while (rs.next()){
        //  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
        //}
        //---------------------------------------------------------------------
        //close all jdbc obj
        //rs.close();
        //stm.close();*/
        //con.close();

}

