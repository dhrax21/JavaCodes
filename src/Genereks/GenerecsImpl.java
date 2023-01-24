package Genereks;

public class GenerecsImpl<T extends String> {
    T obj;

    public GenerecsImpl() {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public void show(){
        System.out.println(obj.getClass().getName());
    }

    @Override
    public String toString() {
        return "GenerecsImpl{" +
                "obj=" + obj +
                '}';
    }
}
