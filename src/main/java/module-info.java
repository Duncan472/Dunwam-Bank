module com.dunwambank {
    requires javafx.controls;
    requires javafx.graphics;
    requires javafx.fxml;

    opens com.dunwambank.Controllers to javafx.fxml;
    opens com.dunwambank.Controllers.Client to javafx.fxml;

    exports com.dunwambank;
    exports com.dunwambank.Controllers;
    exports com.dunwambank.Controllers.Client;
    exports com.dunwambank.views;
    exports com.dunwambank.Models;
}
