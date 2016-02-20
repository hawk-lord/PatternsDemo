package ax.joint.app.impl;

import ax.joint.app.Application;
import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;

/**
 * Created by per on 2016-02-19.
 */
public class MyApplication extends Application {

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    protected Document doCreateDocument() {
        return new MyDocument();
    }

    /**
     *
     * @return
     */
    @Override
    protected boolean canOpenDocument() {
        return true;
    }

    /**
     *
     */
    @Override
    public void aboutToOpenDocument() {

    }
}
