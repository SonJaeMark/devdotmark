package dev.mark.views.blog;

import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Menu;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.vaadin.lineawesome.LineAwesomeIconUrl;

@PageTitle("Blog")
@Route("my-view")
@Menu(order = 2, icon = LineAwesomeIconUrl.PENCIL_ALT_SOLID)
public class BlogView extends Composite<VerticalLayout> {

    public BlogView() {
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
    }
}
