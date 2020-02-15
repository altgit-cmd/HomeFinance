import settings.Format;
import settings.Settings;
import settings.Text;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Date;


public class HomeFinance {
    public static void main(String[] args) throws IOException, FontFormatException {
        init();
        System.out.println(Format.dateMonth(new Date()));

    }

    private static void init() throws IOException, FontFormatException {
        Settings.init();
        Text.init();
        GraphicsEnvironment gt = GraphicsEnvironment.getLocalGraphicsEnvironment();
        gt.registerFont(Font.createFont(Font.TRUETYPE_FONT, Settings.FONT_ROBOTO_LIGHT));
    }
}
