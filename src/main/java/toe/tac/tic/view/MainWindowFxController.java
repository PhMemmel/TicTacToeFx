package toe.tac.tic.view;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import toe.tac.tic.model.Game;
import toe.tac.tic.model.Marker;

/**
 * FX controller class for main window.
 */
public class MainWindowFxController implements PropertyChangeListener {

  Game game;

  @FXML
  Label label11;
  @FXML
  Label label12;
  @FXML
  Label label13;
  @FXML
  Label label21;
  @FXML
  Label label22;
  @FXML
  Label label23;
  @FXML
  Label label31;
  @FXML
  Label label32;
  @FXML
  Label label33;
  @FXML
  Label gameStateLabel;

  public MainWindowFxController() {
    game = new Game();
    game.addListener(this);
  }

  @FXML
  void initialize() {
    updateLabels();
  }

  @FXML
  public void clickedOnField(MouseEvent event) {
    if (event.getTarget().equals(label11)) {
      game.guess('A', 1);
    } else if (event.getTarget().equals(label12)) {
      game.guess('A', 2);
    } else if (event.getTarget().equals(label13)) {
      game.guess('A', 3);
    } else if (event.getTarget().equals(label21)) {
      game.guess('B', 1);
    } else if (event.getTarget().equals(label22)) {
      game.guess('B', 2);
    } else if (event.getTarget().equals(label23)) {
      game.guess('B', 3);
    } else if (event.getTarget().equals(label31)) {
      game.guess('C', 1);
    } else if (event.getTarget().equals(label32)) {
      game.guess('C', 2);
    } else if (event.getTarget().equals(label33)) {
      game.guess('C', 3);
    }

  }


  @Override
  public void propertyChange(PropertyChangeEvent evt) {
    updateLabels();
    if (game.getBoard().getWinner() != Marker.e) {
      gameStateLabel.setText(game.getBoard().getWinner().toString() + " hat gewonnen");
    }
  }

  private void updateLabels() {
    label11.setText(game.getBoard().getCell(1, 1).toString());
    label12.setText(game.getBoard().getCell(1, 2).toString());
    label13.setText(game.getBoard().getCell(1, 3).toString());
    label21.setText(game.getBoard().getCell(2, 1).toString());
    label22.setText(game.getBoard().getCell(2, 2).toString());
    label23.setText(game.getBoard().getCell(2, 3).toString());
    label31.setText(game.getBoard().getCell(3, 1).toString());
    label32.setText(game.getBoard().getCell(3, 2).toString());
    label33.setText(game.getBoard().getCell(3, 3).toString());
  }
}
