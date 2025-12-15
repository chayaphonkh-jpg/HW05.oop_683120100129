#include <iostream>

using namespace std;

class House {
public:
    string model;
    House(string model):model(model){}
    void houseInfo() { cout << "House Model :" << model ; }

    class Bedroom{
    public:
        int room;
        Bedroom(int room):room(room){}
        void bedroomInfo () {cout << "Bedroom : " << room << endl ;}
    };
};

int main()
{
    House h1 ("Thai Style");
    House::Bedroom b1 (3);
    b1.bedroomInfo();
    return 0;
}
