package ax.joint.app.impl;

import ax.joint.app.Application;
import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;

/**
 *
 */
public class MyApplication extends Application {

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    protected Document doCreateDocument() {

        return new MyDocument();
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    protected boolean canOpenDocument() {

        return true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void aboutToOpenDocument() {

    }
}
