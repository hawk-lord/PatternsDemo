package ax.joint.font.impl;

import ax.joint.font.Font;

/**
 * Created by per on 2016-02-19.
 */
public class MyFont extends Font {

    @Override
    public void render() {
        System.out.println(getClass().getName() + " render");
    }
}
