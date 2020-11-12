import java.util.StringTokenizer;

class TextFormatter {
  
  private static int maxLineLength;
  private static String finalText;
 
  
  private static final String text = 
  "Lorem  ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy " +
  "eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et " +
  "accusam et justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est Lorem " +
  "ipsum dolor sit amet. Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod " +
  "tempor invidunt ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero eos et accusam et " +
  "justo duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata sanctus est " +
  "Lorem ipsum dolor sit amet.";

  
  
  public static void main(String[] args) {
    TextFormatter formatter = new TextFormatter(30);
    //formatter.print(text);
   printLeft(text,30);
   printRight(text,30);
  }
    
  // Konstruktor
  public TextFormatter(int maxLineLength) {
    this.maxLineLength = maxLineLength;
  }
/*
  public static void print (String aText, int maxLineLength) {
    StringTokenizer toki = new StringTokenizer(text);
    String empty = "";
    while(toki.hasMoreTokens()){
      if (empty.length() <= maxLineLength) {
        empty += toki.nextToken() + ' ';
        //System.out.println(empty);
      }else{
        //empty += "\n";
        System.out.println(empty);
        empty = "";
        //System.out.println(empty);
      }
    }
    //System.out.println(empty);
  }
  */
  // Ausgabe
 public static void printLeft(String aText,int maxLineLength) {
   
    StringTokenizer toki = new StringTokenizer(text);
    String empty = "";
  
    while (toki.hasMoreTokens()) {
      String word = toki.nextToken();
      if (empty.length() >= (maxLineLength - word.length())) {
        finalText = finalText + empty + "\n";
        empty = word;
      } 
      else if (empty.isEmpty()) {
        empty = word;
      } 
      else {

        empty = empty + " " + word;
      }
    }
    finalText = finalText + empty;
    System.out.println(finalText);
  }

  public static void printRight(String aText,int maxLineLength) {
   
    StringTokenizer toki = new StringTokenizer(text);
    String empty = "";
  
    while (toki.hasMoreTokens()) {
      String word = toki.nextToken();
      if (empty.length() >= (maxLineLength - word.length())) {
        for (int i = 0; i < (maxLineLength - word.length()); i++){
          empty = " " + empty;
        }
          finalText = finalText + empty + "\n";
        empty = word;
      }
      else if (empty.isEmpty()) {
        empty = word;
      } else {
      for (int i = 0; i < (maxLineLength - word.length()); i++){
          empty = " " + empty;
        }
        
      }
    }
    finalText = finalText + empty;
    System.out.println(finalText);
  }
}