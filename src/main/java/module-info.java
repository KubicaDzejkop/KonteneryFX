module pl.gornik.kontenery {
    requires javafx.controls;
    requires javafx.fxml;


    opens pl.gornik.kontenery to javafx.fxml;
    exports pl.gornik.kontenery;
}