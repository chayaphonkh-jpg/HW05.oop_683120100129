namespace cs_oop09A
{
    internal class Program
    {
        static void Main(string[] args)
        {
            var cy1 = new Cylinder(5.5, 10);
            cy1.Info();
            Console.WriteLine(cy1);//call string
        }
    }
}
public class Circle
{

    public double Radius { get; set; } = 1.0;
  
    public Circle(double radius) { Radius = radius; }

    public virtual double Area => Math.PI * Math.Pow(Radius, 2);


    public virtual void Info() => Console.WriteLine($"Circle radius: {Radius} area: {Area}");


}

public class Cylinder : Circle
{
    public double Length { get; set; } = 1.0;
    public Cylinder(double radius, double length) : base(radius)
    {
        Length = length;
    }
    public override double Area => 2 * Math.PI * Radius * (Radius + Length);
    public virtual double Volume => base.Area * Length;
    public override void Info () => Console.WriteLine($"Cylider radius: {Radius}" + $" Length: {Length} area : {Area} volume: {Volume}");

    public override string ToString()
    {
        return $"Cylinder r: {Radius} l: {Length} a: {Area} v: {Volume}";
    }
}