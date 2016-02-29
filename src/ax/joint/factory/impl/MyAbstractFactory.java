package ax.joint.factory.impl;

import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;
import ax.joint.factory.AbstractFactory;
import ax.joint.font.Font;
import ax.joint.font.impl.MyFont;

/**
 *
 */
public class MyAbstractFactory extends AbstractFactory {

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public Font doCreateFont() {

        return new MyFont();
    }

    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public Document doCreateDocument(Font font) {

        return new MyDocument(font);
    }

}
