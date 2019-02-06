public class Rectangle {

    private double length;
    private double width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double getWidth(){
        return width;
    }

    public double getArea(double length, double width){
        return this.length * this.width;

    }
    public double getDiagonal(double length, double width){
        return java.lang.Math.sqrt(this.length *this.length + this.width*this.width);
    }
    public String isSquare(){
        if(this.length == this.width){
            return " Yes";
        }else{return " No";
        }
    }
    public String toString(){
        return "Length: " + this.getLength() + ", Width: " + this.getWidth() + ", Area: " + this.getArea(this.length, this.width)
                + ", Diagonal: " + this.getDiagonal(this.length,this.width) +", Square: "+isSquare();
    }


}
