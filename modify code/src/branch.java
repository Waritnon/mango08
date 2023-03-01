public class branch{
    double angle1 = 30;
    double angle2 =30;
    Turtle a = new Turtle();
    branch(String color,double length,int scale,int angle) {
        a.speed(1);
        a.width(scale);
        a.left(angle);
        a.penColor("brown");
        a.forward(length);
        a.penColor(color);
        Draw(a,length,angle1,angle2);
        a.hide();
    }
    public void Draw(Turtle turtle,double length,double angle1,double angle2){
        if (length < 10) {
            return;
        }
        a.forward(length);
        a.right(angle1);
        Draw(a,length*0.7,angle1*0.8,angle2*0.8);
        a.left(angle1 + angle2);
        Draw(a,length*0.7,angle1*0.8,angle2*0.8);
        a.right(angle2);
        Draw(a,length*0.7,angle1*0.8,angle2*0.8);
        a.backward(length);
    }
}
