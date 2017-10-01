import javafx.scene.control.ScrollPane;
public class FileExplorer extends ScrollPane
{
	private FileExplorer()
	{
		super();
	}
	public static class FileExplorerBuilder
	{
		public FileExplorer build()
		{
			return new FileExplorer();
		}
	}
}
