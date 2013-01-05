package org.vaadin.virkki.cdiutils.addressbook.ui.main;

import javax.inject.Inject;

import org.vaadin.virkki.cdiutils.addressbook.util.Lang;
import org.vaadin.virkki.cdiutils.application.VaadinContext.VaadinScoped;

import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.CheckBox;
import com.vaadin.ui.Label;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

@VaadinScoped
@SuppressWarnings("serial")
public class SharingOptions extends Window {
    @Inject
    private Lang lang;

    public void init() {
        final VerticalLayout mainLayout = new VerticalLayout();
        setContent(mainLayout);

        setModal(true);
        setWidth(50.0f, Unit.PERCENTAGE);
        center();
        setCaption(lang.getText("sharingoptions-caption"));
        mainLayout.addComponent(new Label(lang
                .getText("sharingoptions-content")));
        mainLayout.addComponent(new CheckBox(lang
                .getText("sharingoptions-gmail")));
        mainLayout
                .addComponent(new CheckBox(lang.getText("sharingoptions-mac")));
        final Button close = new Button(lang.getText("ok"));
        close.addListener(new Button.ClickListener() {
            @Override
            public void buttonClick(final ClickEvent event) {
                SharingOptions.this.close();
            }
        });
        mainLayout.addComponent(close);
    }
}