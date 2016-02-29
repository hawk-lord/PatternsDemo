package ax.joint.app;

import ax.joint.doc.Document;
import ax.joint.factory.AbstractFactory;
import ax.joint.font.Font;

/**
 *
 */
public class ApplicationWithFactory {

    public void createDocumentWithFont(AbstractFactory abstractFactory) {
        Font font = abstractFactory.doCreateFont();
        Document document = abstractFactory.doCreateDocument(font);

    }
}
