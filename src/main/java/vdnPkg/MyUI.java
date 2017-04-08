package vdnPkg;


import com.vaadin.annotations.Theme;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import vdnPkg.ui.MyUID;


@SpringUI
@Theme("myTheme")
public class MyUI extends UI {

    MyUID myUID;

    public MyUI(MyUID myUID) {
        this.myUID = myUID;
    }



    @Override
    protected void init(VaadinRequest request) {

        VerticalLayout verticalLayout = new VerticalLayout();
        TextField textField = new TextField();
        Button button = new Button("Button");

        verticalLayout.setSizeFull();
        verticalLayout.setMargin(true);
        verticalLayout.setSpacing(true);

        verticalLayout.addComponents(textField, button, myUID);

        setContent(verticalLayout);
    }
}
