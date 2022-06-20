module com.bncaractere.nbcaractere {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.IUCompteCara to javafx.fxml;
    exports com.IUCompteCara;
}