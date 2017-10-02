import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Main extends Application
{
  public static void main(String args[])
  {
    launch(args);
  }
  public void start(Stage stage)
  {
    Scene scene = new Scene(new FileExplorer.FileExplorerBuilder().build(), 400, 300);

    stage.setTitle("File Explorer");
    stage.setScene(scene);
    stage.show();
  }
}
