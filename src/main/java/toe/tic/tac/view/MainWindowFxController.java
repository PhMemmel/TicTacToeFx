package toe.tic.tac.view;

import java.util.ArrayList;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

/**
 * FX controller class for main window.
 */
public class MainWindowFxController {

  @FXML
  public void clickedOnField(MouseEvent mouseEvent) {
    System.out.println(mouseEvent.getTarget());
    System.out.println("GEKLICKT");
  }


}
