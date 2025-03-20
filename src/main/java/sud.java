module sud {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens se.kth.aderslm.sud to javafx.fxml;
    exports se.kth.aderslm.sud;
}