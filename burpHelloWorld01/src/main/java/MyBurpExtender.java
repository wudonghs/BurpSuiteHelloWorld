import burp.IBurpExtender;
import burp.IBurpExtenderCallbacks;
import burp.ITab;

import java.awt.*;

public class MyBurpExtender implements IBurpExtender , ITab {
    private HelloWorldGui helloWorldGui;
    public void registerExtenderCallbacks(IBurpExtenderCallbacks callbacks) {
        callbacks.printOutput("HelloWorld!");
        callbacks.printError("error!");
        helloWorldGui = new HelloWorldGui();
        //插件名称
        callbacks.setExtensionName("HelloWorld");
        callbacks.addSuiteTab(this);
    }

    //插件在tab上的名字
    public String getTabCaption() {
        return "Hello";
    }
    
    public Component getUiComponent() {
        return helloWorldGui.$$$getRootComponent$$$();
    }
}
