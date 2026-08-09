class Shape{
    // Inheritance - Establishes parent-child relationship
    // 1. Single level
    public void area(){
        System.out.println("display area");
    } 
}

class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}
// 2. multi level

class EquilTriangle extends Triangle{
    public  void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

// 3. Hieratchial 
    class Circle extends  Shape{
        public void area(int r){
            System.out.println((3.14)*r*r);
        }
    }
    // Hybrid 
class Inheritance {
    public void main(){
      
    }
}