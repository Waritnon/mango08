public class DrawBranches {
    String color1;
    String color2;
    String color3;
    String color4;
    String color5;
    String color6;
    String color7;
    String color8;

    DrawBranches(String color1, String color2, String color3, String color4, String color5, String color6, String color7, String color8,double lenght, int scale,int angle) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
        this.color4 = color4;
        this.color5 = color5;
        this.color6 = color6;
        this.color7 = color7;
        this.color8 = color8;
        draw(lenght, scale, angle);

    }

    public void draw(double lenght, int scale,int angle) {
        int angle1 = angle;
        for (int c = 1;angle <= 360; c++) {
            if (angle <= 45) new branch(color1, lenght, scale, angle);
            else if (angle <= 90) new branch(color2, lenght, scale, angle);
            else if (angle <= 135) new branch(color3, lenght, scale, angle);
            else if (angle <= 180) new branch(color4, lenght, scale, angle);
            else if (angle <= 225) new branch(color5, lenght, scale, angle);
            else if (angle <= 270) new branch(color6, lenght, scale, angle);
            else if (angle <= 315) new branch(color7, lenght, scale, angle);
            else if (angle <= 360) new branch(color8, lenght, scale, angle);
            angle = angle + angle1;
        }
    }
}

