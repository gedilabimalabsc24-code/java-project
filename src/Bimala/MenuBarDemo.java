/*
 * MenuBar.java - Creates a simple menu bar for the application
 * Author: Bimala
 * Date: November 2025
 */

package Bimala;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class MenuBarDemo {
    public static MenuBar createMenu() {
        Menu fileMenu = new Menu("File");
        MenuItem exitItem = new MenuItem("Exit");
        exitItem.setOnAction(e -> System.exit(0));

        fileMenu.getItems().add(exitItem);

        Menu helpMenu = new Menu("Help");
        MenuItem aboutItem = new MenuItem("About");
        aboutItem.setOnAction(e -> AlertDialog.showInfo("About", "Student Management System\nBy Team: Dhruvi, Archana & Bimala"));

        helpMenu.getItems().add(aboutItem);

        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(fileMenu, helpMenu);

        return menuBar;
    }
}
