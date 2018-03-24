package grapth;

import java.util.List;
import java.util.Set;

public interface Graph<T> {

    boolean addEdge(T a, T b);

    boolean removeEdge(T a, T b);

    Set<T> getChildren(T a);

    void printGraph();

    List<Set<T>> getGraph();

    void setInitialSize(int initialSize);

}
