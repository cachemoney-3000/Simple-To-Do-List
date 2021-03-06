/*
 * UCF COP3330 Fall 2021 Application Assignment 1 Solution
 * Copyright 2021 Joshua Samontanez
 */

package baseline;

import javafx.collections.ObservableList;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class TopBarFunctions {

    public ObservableList<Task> clearList(ObservableList<Task> item){
        // If this method is called it will clear the items inside the list
        item.clear();
        return item;
    }

    public void title(TextField listTitle, Button button){
        // This method is responsible for replacing the name of the list

        // This will replace the text inside the text field
        listTitle.setText(listTitle.getText());
        // This will replace the text inside the button
        button.setText(listTitle.getText());
    }

}
