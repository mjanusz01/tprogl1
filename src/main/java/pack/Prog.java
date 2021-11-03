package pack;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.Logger;

public final class Prog{

    public static void main(String[] args){

        Logger log = Logger.getLogger("ok");

        try(Scanner s1 = new Scanner(System.in);
            Scanner s2 = new Scanner(System.in);
            Scanner s3 = new Scanner(System.in);
            Scanner s4 = new Scanner(System.in)){

            log.info("Choose a figure - if you'd like to choose rectangle - type r, if you'd like to choose oval - type o");

            String type = s1.nextLine();
            if (Objects.equals(type, "r")) {

                log.info("Type width");
                double a1 = s2.nextDouble();
                log.info("Type height");
                double a2 = s3.nextDouble();
                Rectangle rectangle = new Rectangle(a1, a2);
                log.info("Area: "
                        + rectangle.area() + ", Circuit: " + rectangle.circuit());

            } else if (Objects.equals(type, "o")) {

                log.info("Type radius");
                double r = s4.nextDouble();
                Oval oval = new Oval(r);
                log.info("Area: "
                        + oval.area() + ", Circuit: " + oval.circuit());
            } else {
                log.info("Your figure is invalid");
            }
        }
    }

    private Prog(){

    }

    public static final class Rectangle{
        private final double a, b;
        public Rectangle(double x, double y){
            this.a = x;
            this.b = y;
        }

        public double area(){
            return (a*b);
        }

        public double circuit(){
            return(a+a+b+b);
        }
    }

    //comment

    public static final class Oval{
        private final double r;
        public Oval(double pr){
            this.r = pr;
        }

        public double area(){
            return (Math.PI*r*r);
        }

        public double circuit(){
            return(2*Math.PI*r);
        }
    }

}






