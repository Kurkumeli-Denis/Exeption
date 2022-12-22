class QuadraticEquation {
    double a,b,c,x1,x2;

    
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

   
    void Solution() {
        double d; 

        try {
            d = b*b - 4*a*c;

            
            if (a==0)
                throw new ArithmeticException("Деление на 0."); 

            
            if (d<0)
                throw new ArithmeticException("Уравнение не имеет корней."); 

            x1 = (-b - Math.sqrt(d))/(2*a);
            x2 = (-b + Math.sqrt(d))/(2*a);

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        catch (ArithmeticException e) {
            System.out.println(e); 
        }
    }
}