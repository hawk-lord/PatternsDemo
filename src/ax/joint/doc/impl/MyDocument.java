package ax.joint.doc.impl;

import ax.joint.doc.Document;
import ax.joint.font.Font;

/**
 * Created by per on 2016-02-19.
 */
public class MyDocument extends Document {

    private Font font;

    public MyDocument(){
        System.out.println(getClass().getName() + " constructor");
    }

    public MyDocument(Font font){
        System.out.println(getClass().getName() + " constructor with font");
        this.font = font;
    }
    @Override
    public void doRead() {
        System.out.println("doRead");
    }
}
