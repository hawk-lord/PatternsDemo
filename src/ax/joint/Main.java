package ax.joint;

import ax.joint.app.Application;
import ax.joint.app.ApplicationParameterised;
import ax.joint.app.ApplicationWithFactory;
import ax.joint.app.impl.MyApplication;
import ax.joint.app.impl.MyApplicationParameterised;
import ax.joint.factory.AbstractFactory;
import ax.joint.factory.impl.MyAbstractFactory;

public class Main {

    public static void main(String[] args) {
        System.out.println("Start");

        // Template method
        // Factory method
        Application application1 = new MyApplication();
        application1.openDocument();

        // Parameterised factory method
        ApplicationParameterised applicationParameterised = new ApplicationParameterised();
        applicationParameterised.openDocument();
        ApplicationParameterised myApplicationParameterised = new MyApplicationParameterised();
        myApplicationParameterised.openDocument();

        // Abstract factory
        AbstractFactory abstractFactory = new MyAbstractFactory();
        ApplicationWithFactory applicationWithFactory = new ApplicationWithFactory();
        applicationWithFactory.createDocumentWithFont(abstractFactory);
    }
}
