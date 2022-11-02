package Lab02b;

//Student Name 	: 	 Brendan Phelan
//Student Id Number: C00276685
//Date 			: 	 29-9-2022


public class Rectangle {

	private double recLength;
	private double recWidth;
	
	public Rectangle(double length, double width) {
		recLength = 1;
		recWidth = 1;
		
		setLength(length);
		setWidth(width);
		
	}
	
	
	public double getLength() {
		return recLength;
	}
	
	public void setLength(double length) {
		
		if (length >0.0 && length <=40.0) 
		{
		recLength = length;
		}
	}
	
	public double getWidth() {
		return recWidth;
	}
	
	public void setWidth(double width) {
		
		if (width > 0.0 && width <=40.0) 
		{
		recWidth = width;
		}
	}
	
	public String toString()
	{
	    return "Length = " + recLength +",  Width = " + recWidth + ".";
	}
	
	
	public double getPerimeter()
	
	  {
	   return 2*getWidth() + 2*getLength();
	  }
	
	   
	public double getArea()
	  {
	   return getWidth()*getLength();
	  }

	
	
	public static void printRectangle(double recLength, double recWidth)
    {
        for (int i = 0; i < recLength; i++)
        {
            System.out.println();
            for (int j = 0; j < recWidth; j++)
            {
                // This will output a star * if this is first or last row or if it is the first or last column.
                if (i == 0 || i == recLength-1 || j== 0 || j == recWidth-1)
                	
                   System.out.print("*");
                else
                   System.out.print(" ");
            }
        }
    }
}
