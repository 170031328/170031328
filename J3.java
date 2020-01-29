import java.lang.*;
import java.io.*;
class Box
{
  double length;
  double width;
  double height;
  public Box(double boxWidth, double boxHeight, double boxLength)
  {
    height = boxHeight;
    length = boxLength;
    width = boxWidth;
    
  }
  
  public double volume()
  {
   double volume = length * width * height;
    
    return volume;
  }
  
}
class BoxTester
{
  public static void main(String[] args)
  {
    
    Box box1 = new Box(2.5, 5.0, 6.0);
    System.out.println(box1.volume());

    
  }
}