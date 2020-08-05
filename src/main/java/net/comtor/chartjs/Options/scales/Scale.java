package net.comtor.chartjs.Options.scales;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.util.ArrayList;
import javax.xml.bind.annotation.XmlSeeAlso;
import net.comtor.chartjs.Options.scales.Axes.XAxis;
import net.comtor.chartjs.Options.scales.Axes.YAxis;
import net.comtor.chartjs.Options.scales.Cartesian.CategoryScale;
import net.comtor.chartjs.Options.scales.Cartesian.LinearScale;
import net.comtor.chartjs.Options.scales.Radial.RadialLinearScale;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@XmlSeeAlso({LinearScale.class, CategoryScale.class, RadialLinearScale.class})
public abstract class Scale implements Serializable {

    public final static String CATEGORY_SCALE = "category";
    public final static String LINEAR_SCALE = "linear";
    public final static String RADIAL_SCALE = "radial";
    public final static String LOGARITHMIC_SCALE = "logarithmic";
    public final static String TIME_SCALE = "time";

    public static final String FONT_BOLD = "bold";
    public static final String FONT_NORMAL = "normal";
    public static final String FONT_ITALIC = "italic";
    public static final String FONT_OBLIQUE = "oblique";
    public static final String FONT_INITIAL = "initial";
    public static final String FONT_INHERIT = "inherit";

    private String type;

    public Scale() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
