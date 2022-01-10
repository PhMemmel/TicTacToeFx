package toe.tic.tac;

import toe.tic.tac.view.ExampleJavaFxGuiStarter;
import toe.tic.tac.view.Shell;

/**
 * Main starter class. Needed for properly building fat jar with JavaFX libraries included.
 */
public class Main {

  public static void main(String[] args) {
    ExampleJavaFxGuiStarter.main(args);
    //new Shell().start();
  }
}