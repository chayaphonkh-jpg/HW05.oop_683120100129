//use std::f64::consts::PI;



pub struct Circle{
    pub radius: f64,
}

impl Circle {
    pub fn new(radius: f64) -> Self {
        Circle { radius }
    }

    pub fn area(&self) -> f64 {
        std::f64::consts::PI * self.radius.powi(2)
    }

    pub fn info(&self) {
        println!("Circle with radius: {}, area: {}", self.radius, self.area());
    }

}

impl Default for Circle {
    fn default() -> Self {
        return Self { radius: 1.0 };
 
    }
}

//============================ Rectangle ====================================
pub struct Rectangle {
    pub width: f64,
    pub height: f64,
}

pub trait IShape {   //interface
    fn area(&self) -> f64;//abstract method
    fn info(&self);
}


impl IShape for Rectangle { //implement interface
    fn area(&self) -> f64 {
        return self.width * self.height;
    }

    fn info(&self) {
        println!("-------------Rectangle -------------");
        println!("Width: {:6.2}", self.width);
        println!("Height: {:6.2}", self.height);
        println!("Area: {:6.2}", self.area());

    }
}

fn main() {
    let r1: Rectangle = Rectangle { width: 5.0, height: 40.0 };
    r1.info();
}
