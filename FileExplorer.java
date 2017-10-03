import javafx.scene.control.ScrollPane;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public class FileExplorer extends ScrollPane
{
	private Theme theme;
	private Pane content = new Pane();
	private FileExplorer(Theme theme)
	{
		super();
		this.theme = theme;
		this.setContent(content);
		content.getChildren().add(new FileList("C:\\", theme)); //for testing
	}
	public Theme getTheme()
	{
		return theme;
	}
	public void setTheme(Theme t)
	{
		this.theme = t;
		refresh();
	}
	public void refresh()
	{

	}
	public static class FileExplorerBuilder
	{
		private Theme theme = new Theme(Color.rgb(200,200,200), Color.rgb(30,30,30), Color.rgb(100,100,100), Color.rgb(0,0,0));
		public FileExplorerBuilder setTheme(Theme theme)
		{
			this.theme = theme;
			return this;
		}
		public FileExplorer build()
		{
			return new FileExplorer(theme);
		}
	}
}
