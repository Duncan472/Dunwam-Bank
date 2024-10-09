module com.dunwam.dunwambank {
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
    requires org.xerial.sqlitejdbc;


    opens com.dunwambank to javafx.fxml;
    exports com.dunwambank;
    exports com.dunwambank.Controllers;
    exports com.dunwambank.Controllers.Admin;
    exports com.dunwambank.Controllers.Client;
    exports com.dunwambank.Models;
    exports com.dunwambank.views;

}