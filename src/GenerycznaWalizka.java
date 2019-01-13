public class GenerycznaWalizka<T> {
    private T item;

    public GenerycznaWalizka(T item) {
        this.item = item;
    }

    public Class<?> getClass2(){
        return item.getClass();
    }
}
