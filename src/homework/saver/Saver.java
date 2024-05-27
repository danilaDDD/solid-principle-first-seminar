package homework.saver;

public interface Saver<T extends Savable> {
    void save(T entity);
}
