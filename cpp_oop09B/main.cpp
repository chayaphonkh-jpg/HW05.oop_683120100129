#include <iostream>
#include <string>

using namespace std;

// #########################
class Fish {
protected:
    string type;

public:
    Fish(string type = "Unknown") {
        this->type = type;
    }

    void swimming() {
        cout << "Swimming in the pool!!!!" << endl;
    }
};

// #########################
class Bird {
protected:
    string breed;

public:
    Bird(string breed = "Unknown") {
        this->breed = breed;
    }

    void fly() {
        cout << "Fly in the sky!!!!!!" << endl;
    }
};

// #########################
class Duck : public Fish, public Bird {
public:
    Duck() : Fish(), Bird() {}

    void sound() {
        cout << "Quack Quack!!!!!!" << endl;
    }
};

// #########################
int main() {
    Duck d1;
    d1.fly();
    d1.swimming();
    d1.sound();

    return 0;
}

