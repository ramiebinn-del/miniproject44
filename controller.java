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

    }

}
