package ax.joint.app.impl;

import ax.joint.app.ApplicationParameterised;
import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;
import ax.joint.doc.impl.YourDocument;

/**
 *
 * Contains a factory method.
 */
public class MyApplicationParameterised extends ApplicationParameterised {

    /**
     *
     * {@inheritDoc}
     *
     * @return
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
