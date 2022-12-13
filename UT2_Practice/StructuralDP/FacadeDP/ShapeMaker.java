package UT2_Practice.StructuralDP.FacadeDP;

public class ShapeMaker {
    private Shape Rectangle;
    private Shape Circle;
    private Shape Square;

    ShapeMaker() {
        Rectangle = new Rectangle();
        Circle = new Circle();
        Square = new Square();
    }

    void drawRectangle() {
        Rectangle.draw();
    }

    void drawCircle() {
        Circle.draw();
    }

    void drawSquare() {
        Square.draw();
    }
}
