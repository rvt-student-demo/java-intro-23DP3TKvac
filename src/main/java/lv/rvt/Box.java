package lv.rvt;

public class Box {

  public double length;
  public double height;
  public double width;
  
  public Box (double width, double height, double length) {

    this.length = length;
    this.height = height;
    this.width = width;
  }

  public Box (double side) {

    this.length = side;
    this.height = side;
    this.width = side;
  }

  public double volume() {

    return length * height * width;
  }

  public double area() {

    return 2 * (length * height + width * length * height + width);
  }
    
}

class BoxTester
{

  public static void main ( String[] args )
  {
     Box box = new  Box( 2.5, 5.0, 6.0 ) ;

     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );

     System.out.println( "length: " + box.length + " height: " + box.height + "width:  " + box.width );
  }
}
