import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    private List<StudentGroup> stream;
    public Stream(){
        this.stream = new ArrayList<>();
    }
    public Stream(List<StudentGroup> stream) {
        this.stream = stream;
    }
    public void add(StudentGroup group){
        stream.add(group);
    }

    public List<StudentGroup> getStream() {
        return stream;
    }

    @Override
    public String toString() {
        return "Stream{" +
                "stream=" + stream +
                '}';
    }
}
