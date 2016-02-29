package ax.joint.factory;

import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;
import ax.joint.font.Font;
import ax.joint.font.impl.MyFont;

/**
 * Collection of factory methods.
 */
public abstract class AbstractFactory {

    /**
     * Factory method
     *
     * @return
     */
    public abstract Font doCreateFont();

    /**
     * Factory method
     *
     * @retur
     */
    public abstract Document doCreateDocument(Font font);

}
