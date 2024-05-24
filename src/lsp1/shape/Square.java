package lsp1.shape;

public class Square implements Quadrilateral {
    int side;

    public Square(int side) {
        setSide(side);
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return (int) Math.pow(getSide(), 2);
    }
}
