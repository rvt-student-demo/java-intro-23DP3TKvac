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

  public Box (Box oldBox) {

      this.width = oldBox.width;
      this.height = oldBox.height;
      this.length = oldBox.length;
  }

  public Box biggerBox(Box oldBox) {

    return new Box(1.25 * oldBox.width, 1.25 * oldBox.height, 1.25 * oldBox.length);
  }

  public Box smallerBox(Box oldBox) {

    return new Box(0.75 * oldBox.width, 0.75 * oldBox.height, 0.75 * oldBox.length);
  }

  public boolean nests(Box outsideBox) {

    return this.width <= outsideBox.width &&
           this.height <= outsideBox.height &&
           this.length <= outsideBox.length;
  }

  public double volume() {

    return length * height * width;
  }

  private double faceArea() {

    return width * height;
  }

  public double topArea() {

    return length * width;
  }
  
  private double sideArea() {

    return length * height;
  }

  public double area() {

    return 2 * faceArea() + 2 * topArea() + 2 * sideArea();
  }
}