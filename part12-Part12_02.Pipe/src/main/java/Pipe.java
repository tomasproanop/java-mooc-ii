import java.util.ArrayList;
import java.util.List;

public class Pipe<T> {

    private List<T> pipeList;

    public Pipe() {
        this.pipeList = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        pipeList.add(value);
    }

    public T takeFromPipe() {

        if (pipeList.isEmpty()) {
            return null;
        }
        T value = pipeList.get(0);

        pipeList.remove(0);
        return value;
    }

    public boolean isInPipe() {

        if (pipeList.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }
}