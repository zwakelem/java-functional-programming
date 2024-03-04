package za.co.simplitate.functionalprog.section8;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);

    default Consumer<T> thenAccept(Consumer<T> next) {
        return (T t) -> {
            this.accept(t);
            next.accept(t);
        };
    }
}
