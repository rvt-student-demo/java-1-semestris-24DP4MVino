package rvt;

public class App {

  public static void main (String[] args)
  {
    Box box = new Box( 2.5, 5.0, 6.0 );

    System.out.println("Area: " + box.area() + " volume: " + box.volume());
    System.out.println( "length: " + box.length() + " height: " + box.height() +
                         " width:  " + box.width());
    System.out.println();

    Box oldBox = new Box(box);
    System.out.println("Area: " + box.area() + " volume: " + box.volume());
    System.out.println( "length: " + box.length() + " height: " + box.height() +
                         " width:  " + box.width());
    System.out.println();

    Box biggerBox = box.biggerBox(box);
    System.out.println("Area: " + biggerBox.area() + " volume: " + biggerBox.volume());
    System.out.println( "length: " + biggerBox.length() + " height: " + biggerBox.height() +
                         " width:  " + biggerBox.width());
    System.out.println();

    Box smallerBox = box.smallerBox(box);
    System.out.println("Area: " + smallerBox.area() + " volume: " + smallerBox.volume());
    System.out.println( "length: " + smallerBox.length() + " height: " + smallerBox.height() +
                         " width:  " + smallerBox.width());
    System.out.println();

    System.out.println(biggerBox.nests(box));
  }
}