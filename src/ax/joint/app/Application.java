package ax.joint.app;

import ax.joint.doc.Document;

/**
 * Contains a template method.
 * Contains a factory method.
 */
public abstract class Application {

    /**
     *
     */
    public void addDocument() {
        System.out.println("addDocument");

    }

    /**
     * Template method.
     * Called from main.
     * Uses abstract methods defined in subclass.
     */
    public void openDocument() {
        System.out.println("openDocument");
        if (!canOpenDocument()) {
            return;
        }
        Document document = doCreateDocument();
        System.out.println("Document was created");
        document.open();
    }

    /**
     * Factory method, implemented in subclass.
     * MyApplication creates MyDocument, so there is an Application type for every Document type.
     * <p/>
     * A Parameterised factory method would require references to all different Document types.
     */
    protected abstract Document doCreateDocument();

    /**
     * @return
     */
    protected abstract boolean canOpenDocument();

    /**
     *
     */
    public abstract void aboutToOpenDocument();
}
