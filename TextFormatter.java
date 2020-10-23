class TextFormatter {

  private static final String text = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
          "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
          "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
          "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
          "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
          "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
          "Lorem ipsum dolor sit amet.";

  public static void main(String[] args) {
    TextFormatter formatter = new TextFormatter(30);
    formatter.print(text);
  }

  // Methode
  public TextFormatter(int maxLineLength) {
    char[] textArray = new char[text.length()];
    
    // array befüllen
    for (int i = 0; i < text.length(); i++) {
     textArray = text.toCharArray();
    }
    
    // ausspucken -> Zeilenumbruch nach 30 chars
    for (int i = 0; i < text.length(); i++) {
      int count = 0;
      String aText = "";
      aText += textArray[i];
      if (i == maxLineLength) {
        while (textArray[i] != ' ') {
          System.out.print(textArray[i]);
          i += 1;
          count ++;
        }
        aText += "\n";
        maxLineLength = maxLineLength + (30 + count);
      }
      System.out.print(aText);
    }
  }

  // Ausgabe
  public void print(String aText) {
    System.out.println("Hier sollte der Text mit passendem Umbruch erscheinen.");
  }
}