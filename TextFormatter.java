
import java.util.StringTokenizer;

class TextFormatter {

  private int maxLineLength;
  private static String finalText = "";
  private static String finalText2= "";
  private static String finalText3 = "";

  private static final String text = "Lorem  ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy "
      + "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et "
      + "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem "
      + "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod "
      + "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et "
      + "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est "
      + "Lorem ipsum dolor sit amet.";

  public static void main(String[] args) {
    printLeft(text, 30);
    printRight(text, 30);
    printCentral(text, 30);
  }

  // Konstruktor
  public TextFormatter(int maxLineLength) {
    this.maxLineLength = maxLineLength;
  }

  // Ausgabe
  public static void printLeft(String text, int maxLineLength) {
    StringTokenizer toki = new StringTokenizer(text);
    String zeile = "";

    while (toki.hasMoreTokens()) {
      String word = toki.nextToken();
      if (zeile.length() >= (maxLineLength - word.length())) {
        finalText = finalText + zeile + "\n";
        zeile = word;
      } else if (zeile.isEmpty()) {
        zeile = word;
      } else {
        zeile = zeile + " " + word;
      }
    }
    finalText = finalText + zeile;
    System.out.println(finalText + "\n");
  }

  public static void printRight(String text, int maxLineLength) {
    StringTokenizer toki = new StringTokenizer(text);
    String zeile = "";
    int spaces = 0;

    while (toki.hasMoreTokens()) {
      String word = toki.nextToken();
      if (zeile.length() >= (maxLineLength - word.length())) {
        spaces = (maxLineLength - zeile.length());
        while (spaces != 0) {
          zeile = " " + zeile;
          spaces--;
        }
        finalText2 = finalText2 + zeile + "\n";
        zeile = word;
      } else if (zeile.isEmpty()) {
        zeile = word;
      } else {
        zeile = zeile + " " + word;
      }
    }
    spaces = (maxLineLength - zeile.length());
    while (spaces != 0) {
      zeile = " " + zeile;
      spaces--;
    }
    finalText2 = finalText2 + zeile;
    System.out.println(finalText2 + "\n");
  }

  public static void printCentral(String text, int maxLineLength) {
  StringTokenizer toki = new StringTokenizer(text);
    String zeile = "";
    int spaces = 0;

    while (toki.hasMoreTokens()) {
      String word = toki.nextToken();
      if (zeile.length() >= (maxLineLength - word.length())) {
        spaces = (maxLineLength - zeile.length()) / 2;
        while (spaces != 0) {
          zeile = " " + zeile + " ";
          spaces--;
        }
        finalText3 = finalText3 + zeile + "\n";
        zeile = word;
      } else if (zeile.isEmpty()) {
        zeile = word;
      } else {
        zeile = zeile + " " + word;
      }
    }
    spaces = (maxLineLength - zeile.length()) / 2;
    while (spaces != 0) {
      zeile = " " + zeile + " ";
      spaces--;
    }
    finalText3 = finalText3 + zeile;
    System.out.println(finalText3 + "\n");
  }
}
