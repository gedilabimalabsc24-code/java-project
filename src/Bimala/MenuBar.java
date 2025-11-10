package student.gui;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuBar {
    public static javafx.scene.control.MenuBar createMenu() {
        Menu fileMenu = new Menu("File");
        fileMenu.getItems().add(new MenuItem("Exit"));

        Menu helpMenu = new Menu("Help");
        helpMenu.getItems().add(new MenuItem("About"));

        return new javafx.scene.control.MenuBar(fileMenu, helpMenu);
    }
}
