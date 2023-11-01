package pr20;

public class First<T, V, K> {
    private T t;
    private V v;
    private K k;


    First(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }


    public T getT() {
        return t;
    }


    public V getV() {
        return v;
    }


    public K getK() {
        return k;
    }


    public void setT(T t) {
        this.t = t;
    }


    public void setV(V v) {
        this.v = v;
    }


    public void setK(K k) {
        this.k = k;
    }


    public void print() {
        System.out.println(t.getClass());
        System.out.println(v.getClass());
        System.out.println(k.getClass());
    }
}
