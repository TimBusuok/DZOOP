package DZ1.Ex2;

public class Rectangle{
    int width;
    int height;

    public Rectangle(int width,int height){
        this.width = width;
        this.height = height;
    }
    public void calculateArea(){
        int area = width * height;
        System.out.println("Area: " + area);
    }

    public void calculatePerimeter(){
        int perimetr = 2*(width * height);
        System.out.println("Perimetr: " + perimetr);
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }

    public void giveInfo(){
        System.out.println("Width: " + width);
        System.out.println("Hight:" + height);
    }
}