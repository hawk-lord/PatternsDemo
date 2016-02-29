package ax.joint.font.impl;

import ax.joint.font.Font;

/**
 *
 */
public class YourFont extends Font {

    /**
     * {@inheritDoc}
     */
    @Override
    public void render() {

        System.out.println(getClass().getName() + " render");
    }
}
