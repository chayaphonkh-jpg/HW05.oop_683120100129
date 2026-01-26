namespace cs_oop13A
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var r1 = new Rectangle { wihth = 5.0, height = 6.0 };
            r1.Info();
        }
    }
}


public interface IShape
{
    double Area();
    void Info();

 

}

public struct Rectangle : IShape
{
    public double wihth;
    public double height;

    public double Area() => wihth * height;
    public void Info()
    {
        Console.WriteLine($"Rect width:{wihth:N2} heigth:{height:N2} area:{Area:N2}");
    }


}

//public  struct Rectangle
//{
//    public double wihth;
//    public double height;

//    public double Area => wihth * height;
//    public void Info()
//    {
//        Console.WriteLine($"Rect width:{wihth:N2} heigth:{height:N2} area:{Area:N2}");
//    }
//}
