// d:\ds> javac IQueue.java

package ds;
public interface IQueue
{
    void insert(int d);
    void  remove() ;
    boolean isFull();
    boolean isEmpty();
    void qmenu();
    int size=5;
}