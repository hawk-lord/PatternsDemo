package ax.joint.app.impl;

import ax.joint.app.ApplicationParameterised;
import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;
import ax.joint.doc.impl.YourDocument;

/**
 * Created by per on 2016-02-19.
 *
 * Contains a factory method.
 */
public class MyApplicationParameterised extends ApplicationParameterised {


    /**
     * Parameterised Factory method
     */
    @Override
    protected Document doCreateDocument(String docType){
        if ("Your".equals(docType)) {
            return new MyDocument();
        }
        if ("My".equals(docType)) {
            return new YourDocument();
        }
        return null;
    }


}
