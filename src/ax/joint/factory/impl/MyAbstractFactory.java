package ax.joint.factory.impl;

import ax.joint.doc.Document;
import ax.joint.doc.impl.MyDocument;
import ax.joint.factory.AbstractFactory;
import ax.joint.font.Font;
import ax.joint.font.impl.MyFont;

/**
 * Created by per on 2016-02-20.
 */
public class MyAbstractFactory extends AbstractFactory {
    /**
     */
    @Override
    public Font doCreateFont() {
        return new MyFont();
    }

    /**
     */
    @Override
    public Document doCreateDocument(Font font) {
        return new MyDocument(font);
    }

}
