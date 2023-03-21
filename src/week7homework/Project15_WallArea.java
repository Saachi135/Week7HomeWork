package week7homework;

/**
 * Wall Area
 * Write a class with the name Wall. The class needs two fields (instance variables) with name width
 * and height of type double.
 * The class needs to have two constructors. The first constructor does not have any parameters (no-arg
 * constructor). The second constructor has parameters width and height of type double and it needs to
 * initialize the fields. In case the width is less than 0 it needs to set the width field value to 0, in case the
 * height parameter is less than 0 it needs to set the height field value to 0.
 * Write the following methods (instance methods):
 * * Method named getWidth without any parameters, it needs to return the value of width field.
 * * Method named getHeight without any parameters, it needs to return the value of height field.
 * * Method named setWidth with one parameter of type double, it needs to set the value of the width
 * field. If the parameter is less than 0 it needs to set the width field value to 0.
 * * Method named setHeight with one parameter of type double, it needs to set the value of the
 * height field. If the parameter is less than 0 it needs to set the height field value to 0.
 * * Method named getArea without any parameters, it needs to return the area of the wall
 */
public class Project15_WallArea {

    double width, height;
    // constructor define
    public Project15_WallArea() {
    }
    //Constructor Parameter
    public Project15_WallArea(double width, double height) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getWidth() { // get width
        return width;
    }
    public double getHeight() {  // get height
        return height;
    }
    public void setWidth(Double width) {  //set width
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
    }
    //set height method with one parameter
    public void setHight(double height) {
        if (height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }
    public double getArea() {  //get area
        return (getHeight() * getWidth());
    }
    public static void main(String[] args) {    // main method
        Project15_WallArea wall = new Project15_WallArea(5, 4);
        System.out.println("area = " + wall.getArea());
        wall.setHight(-1.5);
        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());
    }
}
