/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.comtor.chartjs.ComtorOptions.LabelsFormat;

/**
 *
 * @author brayanariza
 */
public class LabelsFormat {

    public final static String FORMAT_PERCENTAGE = "percentage";
    public final static String FORMAT_NUMBER = "number";
    public final static String FORMAT_CURRENCY = "currency";

    // Required parameters
    private String format;
    
    // Optional parameters
    private String currencySymbol;

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
    
    public void setAsPercentageFormat(){
        this.format = FORMAT_PERCENTAGE;
    }

    public void setAsNumberFormat(){
        this.format = FORMAT_NUMBER;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }

    public void setCurrencySymbol(String currencySymbol) {
        this.format = FORMAT_CURRENCY;
        this.currencySymbol = currencySymbol;
    }   
}
