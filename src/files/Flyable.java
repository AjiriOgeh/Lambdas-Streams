package files;

@FunctionalInterface
public interface Flyable { //abstract methods do not have implementations

    //if the interface is only going to be a functional interface , the @Functional interface helps to be a fail-safe.
    // the @functional interface will help to check it if it s a functional interface.
    // the stream api works with functional interfaces
    int fly();
    default int move() {
        return 0;
    }

    default int walk() {
        return 0;
    }
}
