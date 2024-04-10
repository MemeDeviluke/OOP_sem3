import java.util.Iterator;
import java.util.List;

public class StreamIterator implements Iterator<StudentGroup> {
    private List<StudentGroup> stream;
    private int counter;

    public StreamIterator(Stream stream) {
        this.stream = stream.getStream();
        counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < stream.size();
    }

    @Override
    public StudentGroup next() {
        if(hasNext()){
            return stream.get(counter++);
        }
        return null;
    }

    @Override
    public void remove() {
        if(hasNext()){
            stream.remove(counter);
        }
    }
}
