package ax.joint.app;

import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;
import ax.joint.doc.impl.YourDocument;

/**
 *
 * Contains a parameterised factory method.
 *
 * Unlike ax.joint.app.Application, it is a concrete class, the simplest kind of factory.
 * It is subclassed in MyApplicationParameterised to make the factory method behave differently.
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
