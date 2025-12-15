#include <iostream>
#include <cmath>

using namespace std;

class Circle{
private:
    double radius;
public:
    Circle(double radius):radius(radius){}
    Circle():Circle(1.0){}
    double area();
    double diameter();
    double circumference();
    void info(){
        cout << "-------Circle-------  :" << endl;
        cout << "radius         :" << radius<<endl;
        cout << "area           :" << area()<<endl;
        cout << "diameter       :" << diameter() <<endl;
        cout << "circumference  :" << circumference() << endl;
    }
    //getter setter method for radiut
    double getRadius() {return radius; }
    void setRadius(double radius) {this ->radius= radius;}

};

double Circle::area(){return M_PI * pow(radius,2); }
double Circle::diameter() {return 2 * radius;}
double Circle::circumference() {return 2 * M_PI * radius;}


int main()
{
    Circle c1;
    Circle *c3 =new Circle(10.0); //instance pointer style
    c1.info();
    c1.setRadius(100.0);
    c2.info ();
    c3->info();
    delete c3;
    return 0;
}
