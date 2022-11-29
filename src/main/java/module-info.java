module com.aryexgames.othello {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires static lombok;


    opens com.aryexgames.othello to javafx.fxml;
    exports com.aryexgames.othello;
    exports com.aryexgames.othello.controller;
    opens com.aryexgames.othello.controller to javafx.fxml;
}