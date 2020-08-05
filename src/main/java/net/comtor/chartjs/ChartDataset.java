package net.comtor.chartjs;

import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface ChartDataset {

    public static final String BORDER_SKIPPED_BOTTOM = "bottom";
    public static final String BORDER_SKIPPED_LEFT = "left";
    public static final String BORDER_SKIPPED_TOP = "top";
    public static final String BORDER_SKIPPED_RIGHT = "right";
    public static final String BORDER_SKIPPED_FALSE = "false";
    
    public static final String POINT_STYLES_CIRCLE = "circle";
    public static final String POINT_STYLES_CROSS = "cross";
    public static final String POINT_STYLES_CROSS_ROT = "crossRot";
    public static final String POINT_STYLES_DASH = "dash";
    public static final String POINT_STYLES_LINE = "line";
    public static final String POINT_STYLES_RECT = "rect";
    public static final String POINT_STYLES_RECT_ROUNDED = "rectRounded";
    public static final String POINT_STYLES_RECT_ROT = "rectRot";
    public static final String POINT_STYLES_STAR = "star";
    public static final String POINT_STYLES_TRIANGLE = "triangle";
    
    public static final String BORDER_ALIGN_CENTER= "CENTER";
    public static final String BORDER_ALIGN_INNER= "inner";
    
    public static final String BORDER_CAP_STYLE_BUTT = "butt";
    public static final String BORDER_CAP_STYLE_ROUND = "round";
    public static final String BORDER_CAP_STYLE_SQUARE = "square";

    public static final String BORDER_JOIN_STYLE_BEVEL = "bevel";
    public static final String BORDER_JOIN_STYLE_ROUNDL = "round";
    public static final String BORDER_JOIN_STYLE_MITTER = "mitter";

    public static final String CUBIC_INTERPOLATION_MODE_DEFAULT = "default";
    public static final String CUBIC_INTERPOLATION_MODE_MONOTONE = "monotone";

    public static final String STEPPED_LINE_FALSE = "false";
    public static final String STEPPED_LINE_TRUE = "true";
    public static final String STEPPED_LINE_BEFORE = "before";
    
        
    String getLabel();

    ArrayList<String> getBackgroundColor();

    ArrayList<String> getBorderColor();

    Integer getBorderWidth();

    String getHoverBackgroundColor();

    String getHoverBorderColor();

    Integer getHoverBorderWidth();

    //ChartJsFill getFill();
    
}
