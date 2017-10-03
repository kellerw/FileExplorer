public class FileList extends ScrollPane
{
	private Theme theme;
  private String directory;
	private Pane content = new Pane();
  public FileList(String directory, theme theme)
  {
    this.theme = theme;
    this.directory = directory;
    //preferably have a top part for folders and a bottom part for files(?)
  }
}
