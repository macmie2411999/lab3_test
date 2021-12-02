import java.awt.*;

public class Config {
    final static Color[] colors = {Color.green, Color.red, Color.blue,
            Color.pink, Color.orange, Color.cyan, Color.magenta};

    final static Font mainFont = new Font("Monospaced", Font.BOLD, 48);
    final static Font smallFont = mainFont.deriveFont(Font.BOLD, 18);

    final static Dimension dim = new Dimension(640, 640);

    final static Rectangle gridRect = new Rectangle(46, 47, 308, 517);
    final static Rectangle previewRect = new Rectangle(387, 47, 200, 200);
    final static Rectangle titleRect = new Rectangle(100, 85, 252, 100);
    final static Rectangle clickRect = new Rectangle(50, 375, 252, 40);

    final static int blockSize = 30;
    final static int nRows = 18;
    final static int nCols = 12;
    final static int topMargin = 50;
    final static int leftMargin = 20;
    final static int scoreX = 400;
    final static int scoreY = 330;
    final static int titleX = 130;
    final static int titleY = 150;
    final static int clickX = 120;
    final static int clickY = 400;
    final static int previewCenterX = 467;
    final static int previewCenterY = 97;

    final static Stroke largeStroke = new BasicStroke(5);
    final static Stroke smallStroke = new BasicStroke(2);

    final static Color squareBorder = Color.white;
    final static Color titlebgColor = Color.white;
    final static Color textColor = Color.black;
    final static Color bgColor = new Color(0xDDEEFF);
    final static Color gridColor = new Color(0xBECFEA);
    final static Color gridBorderColor = new Color(0x7788AA);
}