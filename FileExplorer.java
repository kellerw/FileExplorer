import javafx.scene.control.ScrollPane;
public class FileExplorer
{
	private FileExplorer()
	{

	}
	public ScrollPane getScrollPane()
	{
		return new ScrollPane();
	}
	public static class FileExplorerBuilder
	{
		public FileExplorer build()
		{
			return new FileExplorer();
		}
	}
}
