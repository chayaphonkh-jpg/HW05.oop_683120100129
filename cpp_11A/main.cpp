#include <iostream>

using namespace std;

class Animal {
public:
    string color;
    string size;
    virtual void sound() = 0;
    virtual void eat() =  0;
};

class Mammalia : public Animal {
public:
    int numberBabies;
    void sound() override { cout << "Mammalia Sound";}
    void eat() override { cout << "Mammalia Eatind";}
    virtual void run () {cout << "Mammalai Running";}
};



class Dog : public Mammalia {
public:
    bool fierce;
    virtual void bark() { cout << " Dog Barkind!!!!!!!!!";}
    void eat() override final {cout << "DoG Eating!!!!!!!!";}
};

class thaiRidgeBack final: public Dog{
public:
    string origin;
    \\void eat()
};

int main()
{
    cout << "Hello World!" << endl;
    return 0;
}
