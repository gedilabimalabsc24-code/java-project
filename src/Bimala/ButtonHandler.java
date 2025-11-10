/*
 * ButtonHandler.java - Handles button click actions
 * Author: Bimala
 * Date: November 2025
 */

package Bimala;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ButtonHandler implements EventHandler<ActionEvent> {
    private String message;

    public ButtonHandler(String message) {
        this.message = message;
    }

    @Override
    public void handle(ActionEvent event) {
        AlertDialog.showInfo("Button Clicked", message);
    }
}
