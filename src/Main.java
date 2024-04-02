//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
   String language;

   Main(String l){
       language = l;
       System.out.println("Language is " + language);
   }

    public static void main(String[] args) {
        Main m = new Main("Java");
        Main m2 = new Main("Python");
        Main m3 = new Main("C");
        Main m4 = new Main("JS");

    }
}