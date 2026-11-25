class Shape {
    void display() {
        System.out.println("Area:");
    }
}

class Circle extends Shape {
    void area() {
        System.out.println(Math.PI * 5 * 5);
    }
}

class Square extends Shape {
    void area() {
        System.out.println(4 * 4);
    }
}

class Rectangle extends Shape {
    void area() {
        System.out.println(6 * 3);
    }
}

class Main1{
    public static void main(String[] args) {
        Circle c = new Circle();
        Square s = new Square();
        Rectangle r = new Rectangle();

        c.area();
        s.area();
        r.area();
    }
}