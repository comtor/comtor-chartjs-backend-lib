package net.comtor.chartjs.Options.Tooltip;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 *
 * @author vihlai
 */
@JsonInclude(Include.NON_EMPTY)
public class TooltipCallback {

    private String beforeTitle;
    private String title;
    private String afterTitle;
    private String beforeBody;
    private String beforeLabel;
    private String label;
    private String labelColor;
    private String labelTextColor;
    private String afterLabel;
    private String afterBody;
    private String beforeFooter;
    private String footer;
    private String afterFooter;

    public TooltipCallback() {
    }

    public TooltipCallback(String beforeTitle, String title, String afterTitle, String beforeBody, String beforeLabel, String label, String labelColor, String labelTextColor, String afterLabel, String afterBody, String beforeFooter, String footer, String afterFooter) {
        this.beforeTitle = beforeTitle;
        this.title = title;
        this.afterTitle = afterTitle;
        this.beforeBody = beforeBody;
        this.beforeLabel = beforeLabel;
        this.label = label;
        this.labelColor = labelColor;
        this.labelTextColor = labelTextColor;
        this.afterLabel = afterLabel;
        this.afterBody = afterBody;
        this.beforeFooter = beforeFooter;
        this.footer = footer;
        this.afterFooter = afterFooter;
    }

    public String getBeforeTitle() {
        return beforeTitle;
    }

    public void setBeforeTitle(String beforeTitle) {
        this.beforeTitle = beforeTitle;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAfterTitle() {
        return afterTitle;
    }

    public void setAfterTitle(String afterTitle) {
        this.afterTitle = afterTitle;
    }

    public String getBeforeBody() {
        return beforeBody;
    }

    public void setBeforeBody(String beforeBody) {
        this.beforeBody = beforeBody;
    }

    public String getBeforeLabel() {
        return beforeLabel;
    }

    public void setBeforeLabel(String beforeLabel) {
        this.beforeLabel = beforeLabel;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLabelColor() {
        return labelColor;
    }

    public void setLabelColor(String labelColor) {
        this.labelColor = labelColor;
    }

    public String getLabelTextColor() {
        return labelTextColor;
    }

    public void setLabelTextColor(String labelTextColor) {
        this.labelTextColor = labelTextColor;
    }

    public String getAfterLabel() {
        return afterLabel;
    }

    public void setAfterLabel(String afterLabel) {
        this.afterLabel = afterLabel;
    }

    public String getAfterBody() {
        return afterBody;
    }

    public void setAfterBody(String afterBody) {
        this.afterBody = afterBody;
    }

    public String getBeforeFooter() {
        return beforeFooter;
    }

    public void setBeforeFooter(String beforeFooter) {
        this.beforeFooter = beforeFooter;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getAfterFooter() {
        return afterFooter;
    }

    public void setAfterFooter(String afterFooter) {
        this.afterFooter = afterFooter;
    }

}
