package ax.joint.app;

import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;
import ax.joint.doc.impl.YourDocument;

/**
 * Created by per on 2016-02-19.
 *
 * Contains a factory method.
 */
public class ApplicationParameterised {
    /**
     *
     */
    public void addDocument(){
        System.out.println("addDocument");

    }

    /**
     *
     */
    public void openDocument(){
        System.out.println("openDocument");
        Document document = doCreateDocument("My");
        System.out.println("Document was created");
        document.open();
    }

    /**
     * Parameterised Factory method
     */
    protected Document doCreateDocument(String docType){
        if ("My".equals(docType)) {
            return new MyDocument();
        }
        if ("Your".equals(docType)) {
            return new YourDocument();
        }
        return null;
    }


    /**
     *
     * @return
     */
    //protected abstract boolean canOpenDocument();

    /**
     *
     */
    //public abstract void aboutToOpenDocument();
}
