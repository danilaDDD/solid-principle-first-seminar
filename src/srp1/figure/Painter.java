package srp1.figure;

public interface Painter <T extends Shape>{
    void draw(T shape);
}
