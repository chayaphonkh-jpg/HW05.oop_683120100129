package main

import "fmt"

type IShape interface {  //Interfack
	Area() float64    // Method insnatur
	Perimeter() float64
	Info() string
}

type Rectangle struct { //Struct instead class
	Width, Height float64
}

func (r Rectangle) Area() float64 { //Method implementation for Area
	return r.Width * r.Height
}

func (r Rectangle) Perimeter() float64 { //Method implementation for Perimeter
	return 2 * (r.Width + r.Height)
}

func (r Rectangle) Info() {
	fmt.Printf("Rectangle -  Width : %.2f, Height=%.2f,Area: %.2f,Perimeter: %.2f\n",
		r.Width, r.Height, r.Area(), r.Perimeter())
}

func PrintfShapeInfo(s IShape) {
	fmt.Println(s)
	fmt.Printf("Area: %.2f\n", s.Area())
	fmt.Printf("Perimeter: %.2f\n", s.Perimeter())
}

func main() {
	r1 := Rectangle{Width: 5, Height: 10}
	r1.Info()
	fmt.Println("-------Info of Shape ----------")
	PrintfShapeInfo(r1.)

}