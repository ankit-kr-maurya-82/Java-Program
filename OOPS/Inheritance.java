class Shape{
    // String color;
    public void area(){
        System.out.println("displays area");
    }
    
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println((l*h)/2);
    }
}

class EquilateralTriangle extends  Triangle{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends  Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

class Inheritance {
    public void main(){
        Triangle t1 = new Triangle();
        // t1.color = "red";
        t1.area();
        t1.area(8,7);
    }
}