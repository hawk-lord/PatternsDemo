package ax.joint.app;

import ax.joint.doc.Document;
import ax.joint.factory.AbstractFactory;
import ax.joint.font.Font;

/**
 * Created by per on 2016-02-19.
 *
 * Contains a template method.
 * Contains a factory method.
 */
public class ApplicationWithFactory {

    public void createDocumentWithFont(AbstractFactory abstractFactory) {
        Font font = abstractFactory.doCreateFont();
        Document document = abstractFactory.doCreateDocument(font);

    }
}
