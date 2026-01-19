namespace cs_oop12A
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //A c1 = new C();
            //B c2 = new B();
            //C c3 = new C();
            //var c4 = (C)c2;
            //var c5 = new B() as C;
            //Console.WriteLine(c3 is C);
            //Console.WriteLine(c3 is B);
            //Console.WriteLine(c3 is A);
            //Console.WriteLine(c3 == c2);
            //Console.WriteLine(c3.Equals(c2));

        }
    }

    //public abstract class A { }
    //public class B:A { }
    //public class C:B { }
    //public class D:C { }




    public interface IShape
    {
        static readonly double abc = 9;
        double GetArea();
        void PrintInfo();
        virtual void SomeThing()
        {
            Console.WriteLine("Hello Shape");
        }
    }

    public interface Ishape3D
    {
        double GetVolume();
    }
    public abstract class Shape : IShape
    {
        public abstract double GetArea();
        public abstract void PrintInfo();

    }
    public class Rectagle : Shape
    {

        public double Width { get; set; }
        public double Height { get; set; }
        public override double GetArea() => Width * Height;
        public override void PrintInfo()
        {
            Console.WriteLine($"Rect  [w:{Width:N2} h:{Height:N2} a:{GetArea():N2}]");
        }
    }
}

