import javafx.scene.paint.Color;
public class Theme
{
  //Color of background
  private Color primary;
  //Color of borders
  private Color secondary;
  //Color of secondary background
  private Color tertiary;
  //Color of text
  private Color text;
  public Theme(Color primary, Color secondary, Color tertiary, Color text)
  {
    this.primary = primary;
    this.secondary = secondary;
    this.tertiary = tertiary;
    this.text = text;
  }
  public Color getPrimary()
  {
    return primary;
  }
  public Color getSecondary()
  {
    return secondary;
  }
  public Color getTertiary()
  {
    return tertiary;
  }
  public Color getText()
  {
    return text;
  }
}
