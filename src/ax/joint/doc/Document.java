package ax.joint.doc;

/**
 * Created by per on 2016-02-19.
 */
public abstract class Document {
    public void save(){

        System.out.println(getClass().getName() + " was saved");
    };
    public void open(){

        System.out.println(getClass().getName() + " was opened");
    };
    public void close(){

        System.out.println(getClass().getName() + " was closed");
    };
    public abstract void doRead();
}
