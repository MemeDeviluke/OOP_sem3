import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StreamService {
    private Stream stream;

    public Stream getStream() {
        return stream;
    }

    public StreamService(Stream stream) {
        this.stream = stream;
    }

    public void getSortedStream(List<Stream> streams){
        Collections.sort(streams,new StreamComparator());
    }

}
