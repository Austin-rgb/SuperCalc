package ochie.supercalc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pg {

  public static void main(String[] args) {
    Pattern openBra = Pattern.compile("\\(\\w*?\\)");
    CharSequence code =
        "Ostine Odhiambo (Ostiness) is looking for Fred (who is with violent (Hisgirlfriend) at nyawita )";
    Matcher openMatcher = openBra.matcher(code);
   while ( openMatcher.find())
    
    System.out.println (openMatcher.group());
  }
}
