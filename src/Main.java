import java.util.Scanner;

class Circle{
    public
    double r, l, a, b, rr, ll, aa, bb;
    Scanner s = new Scanner(System.in);
    static  double lench(double a, double aa,double b, double bb){
        double vector_x = aa-a;
        double vector_y = bb-b;
        double v_lench = Math.sqrt(vector_x*vector_x+vector_y*vector_y);
        return v_lench;
    }
    static double compute(double a, double aa, double r, double rr, double b, double bb){
       double vector_length = lench(a,aa,b,bb);
       if(rr<r){r = rr+r; rr = r-rr; r = r-rr;}
       if(vector_length == (r+rr)) return 0;
       if(rr==Math.round(vector_length+r)) return 0;
       return 1;
    }
    static double calc(double x, double y, double xx, double yy){
        double vect_x = Math.abs(x-xx);
        double vect_y = Math.abs(y-yy);
        return Math.sqrt(vect_x*vect_x+vect_y*vect_y);
    }
    static  void message(String s, double r, double l, double x, double y){
        System.out.print('\n' + s);
        System.out.print(", длинна  = " + l);
        System.out.print(", координата x = " + x);
        System.out.print(", координата y = " + y + '\n');
    }
    static void c_l(double r) {
        System.out.print("\nДлинна окружности равна " + 2 * 3.14 * r);
    }
    Circle(){
        System.out.print("\nВведите радиус\n");
        r = s.nextDouble();
        c_l(r);
        System.out.print("\nВведите координату x\n");
        a = s.nextDouble();
        System.out.print("\nВведите координату y\n");
        b = s.nextDouble();

        /*rr = (int)Math.random()*10;
        aa = (int)Math.random()*199-99;
        bb = (int)Math.random()*199-99;*/
        System.out.print("\nВведите радиус\n");
        rr = s.nextDouble();
        System.out.print("\nВведите координату x\n");
        aa = s.nextDouble();
        System.out.print("\nВведите координату y\n");
        bb = s.nextDouble();

        message("Данные вашей окружности", r, l, a, b);
        message("Данные случайной окружности", rr, ll, aa, bb);
        System.out.print("\nОкружности = " + compute(a, aa, r, rr, b, bb));
    }
}

class Main{
    public static void main(String[] argc){
        Circle c = new Circle();
    }
}