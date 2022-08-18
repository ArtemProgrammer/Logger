import java.util.Locale;
import java.util.ResourceBundle;

public class Localization {
    private static ResourceBundle resourceBundle;
    private static Locale locale;

    public Localization(ResourceBundle resourceBundle) {
        this.resourceBundle = resourceBundle;
    }

    public static ResourceBundle getResourceBundle(String[] args) {
        if (args.length == 0) {
            locale = Locale.getDefault();
        }
        else {
            locale = new Locale(args[0]);
        }
        return ResourceBundle.getBundle("locale", locale);
    }
}
