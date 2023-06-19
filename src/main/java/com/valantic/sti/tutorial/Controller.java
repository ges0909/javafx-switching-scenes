package com.valantic.sti.tutorial;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import lombok.extern.slf4j.Slf4j;

import java.net.URL;
import java.util.ResourceBundle;

@Slf4j
public class Controller implements Initializable {

    // called as soon the view loads
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        log.info("Loading user data...");
    }

    public void loginButtonClocked() {
        log.info("User logged in...");
    }
}
