import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Calculadora c1 = new Calculadora();
    c1.introducao();   
    c1.calculadora();
    c1.result();
    c1.cont();
  }
}