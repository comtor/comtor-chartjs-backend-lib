package net.comtor.chartjs.Options.layout;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Layout {

    private Padding padding;

    public Layout() {
    }

    public Layout(Padding padding) {
        this.padding = padding;
    }

    public Padding getPadding() {
        return padding;
    }

    public void setPadding(Padding padding) {
        this.padding = padding;
    }

}
