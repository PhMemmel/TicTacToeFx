package toe.tac.tic;

import toe.tac.tic.view.ExampleJavaFxGuiStarter;

/**
 * Main starter class. Needed for properly building fat jar with JavaFX libraries included.
 */
public class Main {

  public static void main(String[] args) {
    ExampleJavaFxGuiStarter.main(args);
    //new Shell().start();
  }
}