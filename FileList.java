import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class FileList extends ScrollPane
{
	private Theme theme;
  private String directory;
	private Pane content = new Pane();
  public FileList(String directory, Theme theme)
  {
    this.theme = theme;
    this.directory = directory;
    //preferably have a top part for folders and a bottom part for files(?)
  }
}
