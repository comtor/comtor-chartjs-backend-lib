package net.comtor.chartjs.Options.Tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Tooltip {

    public static final String AXIS_X = "x";
    public static final String AXIS_Y = "y";
    public static final String AXIS_XY = "xy";

    public static final String MODES_POINT = "poInteger";
    public static final String MODES_NEAREST = "nearest";
    public static final String MODES_INDEX = "index";
    public static final String MODES_DATASET = "dataset";
    public static final String MODES_X = "x";
    public static final String MODES_Y = "y";

    public static final String POSITION_MODES_AVERAGE = "average";
    public static final String POSITION_MODES_NEAREST = "nearest";

    public static final String ALIGN_START = "start";
    public static final String ALIGN_CENTER = "center";
    public static final String ALIGN_END = "end";
    public static final String ALIGN_LEFT = "left";

    private boolean enabled = true;
    private String custom;
    private String mode;
    private boolean intersect;
    private String position = POSITION_MODES_AVERAGE;
    private TooltipCallback callbacks;
    private String itemSort;
    private String filter;
    private String backgroundColor;
    private String titleFontFamily;
    private Integer titleFontSize;
    private String titleFontStyle;
    private String titleFontColor;
    private String titleAlign = ALIGN_LEFT;
    private Integer titleSpacing;
    private Integer titleMarginBottom;
    private String bodyFontFamily;
    private Integer bodyFontSize;
    private String bodyFontStyle = "normal";
    private String bodyFontColor;
    private String bodyAlign;
    private Integer bodySpacing;
    private String footerFontFamily;
    private Integer footerFontSize;
    private String footerFontStyle;
    private String footerFontColor;
    private String footerAlign = ALIGN_LEFT;
    private Integer footerSpacing;
    private Integer footerMarginTop;
    private Integer xPadding;
    private Integer yPadding;
    private Integer caretPadding;
    private Integer caretSize;
    private Integer cornerRadius;
    private String multiKeyBackground;
    private String borderColor;
    private boolean displayColors;
    private Integer borderWidth;
    private boolean rtl = true;
    private String axis;
    private Integer animationDuration;
    //private String textDirection;

    public Tooltip() {
    }

    public Tooltip(String mode) {
        this.mode = mode;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public boolean isIntersect() {
        return intersect;
    }

    public void setIntersect(boolean Integerersect) {
        this.intersect = Integerersect;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getTitleFontFamily() {
        return titleFontFamily;
    }

    public void setTitleFontFamily(String titleFontFamily) {
        this.titleFontFamily = titleFontFamily;
    }

    public Integer getTitleFontSize() {
        return titleFontSize;
    }

    public void setTitleFontSize(Integer titleFontSize) {
        this.titleFontSize = titleFontSize;
    }

    public String getTitleFontStyle() {
        return titleFontStyle;
    }

    public void setTitleFontStyle(String titleFontStyle) {
        this.titleFontStyle = titleFontStyle;
    }

    public String getTitleFontColor() {
        return titleFontColor;
    }

    public void setTitleFontColor(String titleFontColor) {
        this.titleFontColor = titleFontColor;
    }

    public String getTitleAlign() {
        return titleAlign;
    }

    public void setTitleAlign(String titleAlign) {
        this.titleAlign = titleAlign;
    }

    public Integer getTitleSpacing() {
        return titleSpacing;
    }

    public void setTitleSpacing(Integer titleSpacing) {
        this.titleSpacing = titleSpacing;
    }

    public Integer getTitleMarginBottom() {
        return titleMarginBottom;
    }

    public void setTitleMarginBottom(Integer titleMarginBottom) {
        this.titleMarginBottom = titleMarginBottom;
    }

    public String getBodyFontFamily() {
        return bodyFontFamily;
    }

    public void setBodyFontFamily(String bodyFontFamily) {
        this.bodyFontFamily = bodyFontFamily;
    }

    public Integer getBodyFontSize() {
        return bodyFontSize;
    }

    public void setBodyFontSize(Integer bodyFontSize) {
        this.bodyFontSize = bodyFontSize;
    }

    public String getBodyFontStyle() {
        return bodyFontStyle;
    }

    public void setBodyFontStyle(String bodyFontStyle) {
        this.bodyFontStyle = bodyFontStyle;
    }

    public String getBodyFontColor() {
        return bodyFontColor;
    }

    public void setBodyFontColor(String bodyFontColor) {
        this.bodyFontColor = bodyFontColor;
    }

    public String getBodyAlign() {
        return bodyAlign;
    }

    public void setBodyAlign(String bodyAlign) {
        this.bodyAlign = bodyAlign;
    }

    public Integer getBodySpacing() {
        return bodySpacing;
    }

    public void setBodySpacing(Integer bodySpacing) {
        this.bodySpacing = bodySpacing;
    }

    public String getFooterFontFamily() {
        return footerFontFamily;
    }

    public void setFooterFontFamily(String footerFontFamily) {
        this.footerFontFamily = footerFontFamily;
    }

    public Integer getFooterFontSize() {
        return footerFontSize;
    }

    public void setFooterFontSize(Integer footerFontSize) {
        this.footerFontSize = footerFontSize;
    }

    public String getFooterFontStyle() {
        return footerFontStyle;
    }

    public void setFooterFontStyle(String footerFontStyle) {
        this.footerFontStyle = footerFontStyle;
    }

    public String getFooterFontColor() {
        return footerFontColor;
    }

    public void setFooterFontColor(String footerFontColor) {
        this.footerFontColor = footerFontColor;
    }

    public String getFooterAlign() {
        return footerAlign;
    }

    public void setFooterAlign(String footerAlign) {
        this.footerAlign = footerAlign;
    }

    public Integer getFooterSpacing() {
        return footerSpacing;
    }

    public void setFooterSpacing(Integer footerSpacing) {
        this.footerSpacing = footerSpacing;
    }

    public Integer getFooterMarginTop() {
        return footerMarginTop;
    }

    public void setFooterMarginTop(Integer footerMarginTop) {
        this.footerMarginTop = footerMarginTop;
    }

    public Integer getxPadding() {
        return xPadding;
    }

    public void setxPadding(Integer xPadding) {
        this.xPadding = xPadding;
    }

    public Integer getyPadding() {
        return yPadding;
    }

    public void setyPadding(Integer yPadding) {
        this.yPadding = yPadding;
    }

    public Integer getCaretPadding() {
        return caretPadding;
    }

    public void setCaretPadding(Integer caretPadding) {
        this.caretPadding = caretPadding;
    }

    public Integer getCaretSize() {
        return caretSize;
    }

    public void setCaretSize(Integer caretSize) {
        this.caretSize = caretSize;
    }

    public Integer getCornerRadius() {
        return cornerRadius;
    }

    public void setCornerRadius(Integer cornerRadius) {
        this.cornerRadius = cornerRadius;
    }

    public String getMultiKeyBackground() {
        return multiKeyBackground;
    }

    public void setMultiKeyBackground(String multiKeyBackground) {
        this.multiKeyBackground = multiKeyBackground;
    }

    public boolean isDisplayColors() {
        return displayColors;
    }

    public void setDisplayColors(boolean displayColors) {
        this.displayColors = displayColors;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(String borderColor) {
        this.borderColor = borderColor;
    }

    public Integer getBorderWidth() {
        return borderWidth;
    }

    public void setBorderWidth(Integer borderWidth) {
        this.borderWidth = borderWidth;
    }

    public boolean isRtl() {
        return rtl;
    }

    public void setRtl(boolean rtl) {
        this.rtl = rtl;
    }

    public String getCustom() {
        return custom;
    }

    public void setCustom(String custom) {
        this.custom = custom;
    }

    public TooltipCallback getCallbacks() {
        return callbacks;
    }

    public void setCallbacks(TooltipCallback callbacks) {
        this.callbacks = callbacks;
    }

    public String getItemSort() {
        return itemSort;
    }

    public void setItemSort(String itemSort) {
        this.itemSort = itemSort;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getAxis() {
        return axis;
    }

    public void setAxis(String axis) {
        this.axis = axis;
    }

    public Integer getAnimationDuration() {
        return animationDuration;
    }

    public void setAnimationDuration(Integer animationDuration) {
        this.animationDuration = animationDuration;
    }

}
