#include <iostream>
#include <cmath>

using namespace std;

class Circle{
public:
    double radius;
    Circle(double radius):radius(radius){}
    virtual double area(){ return M_PI * pow(radius,2);}
    virtual void info(){
        cout << " Circle radius:" << radius << "area: "<<area()<<endl;
    }
};

class Cylinder:public Circle{
public:
    double length;
    Cylinder(double radius,double length):Circle(radius),length(length){}
    double area() override { return 2 * M_PI * radius * (radius + length);}
    virtual double volume() {return Circle::area() * length; }
    void info () override{
        cout<< "Cylinder radius:" << radius << " length:" << length << "area: "<< area()<<"volume: "<< volume() <<endl;

    }
};

int main()
{
    Cylinder cy1(5.5,10);
    cy1.info();
    return 0;
}
