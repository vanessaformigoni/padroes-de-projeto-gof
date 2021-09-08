package templateMethod;

public abstract class Game {

    public abstract void initialize();
    public abstract void startPlay();
    public abstract void endPlay();

    public void play() { //esse é o template para as classes
        this.initialize();
        this.startPlay();
        this.endPlay();
    }
}
