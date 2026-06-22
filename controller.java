import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class controller {

    @FXML
    private RadioButton button_gca;

    @FXML
    private RadioButton button_gic;

    @FXML
    private RadioButton button_gtr;

    @FXML
    private Button button_save;

    @FXML
    private CheckBox checkbox_micro;

    @FXML
    private CheckBox checkbox_network;

    @FXML
    private CheckBox checkbox_oop;

    @FXML
    private DatePicker datepicker_dob;

    @FXML
    private ToggleGroup group_gtr;

    @FXML
    private Label label_result;

    @FXML
    private TextField textfield_name;

    @FXML
    void onbutton(ActionEvent event) {
        String name = textfield_name.getText();
        String birth = datepicker_dob.getValue().toString();
        String department="";
        if(button_gtr.isSelected()) {
            department = "GTR";
        } else if(button_gic.isSelected()) {
            department = "Gic";
        } else if(button_gca.isSelected()) {
            department = "GCA";
        }
        ArrayList<String> courses = new ArrayList<>();
        if(checkbox_micro.isSelected()) {
            courses.add("Microcontroller");
        }
        if(checkbox_network.isSelected()) {
            courses.add("Network");
        if(checkbox_oop.isSelected()) {
            courses.add("OOP");
        }
    }
    label_result.setText("Name: " + name + "\nBirth: " + birth + "\nDepartment: " + department + "\nCourses: " + String.join(", ", courses));
}


}
