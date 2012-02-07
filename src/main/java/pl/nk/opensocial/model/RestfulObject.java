package pl.nk.opensocial.model;

public class RestfulObject<T> {

    T entry;

    public T getEntry() {
        return entry;
    }

    public void setEntry(T entry) {
        this.entry = entry;
    }

}
