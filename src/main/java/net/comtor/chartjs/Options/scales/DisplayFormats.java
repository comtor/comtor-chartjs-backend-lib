package net.comtor.chartjs.Options.scales;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author vihlai
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DisplayFormats {

    private String millisecond;
    private String second;
    private String minute;
    private String hour;
    private String day;
    private String week;
    private String month;
    private String quarter;
    private String year;

    public String getMillisecond() {
        return millisecond;
    }

    public DisplayFormats setMillisecond(String millisecond) {
        this.millisecond = millisecond;
        return this;
    }

    public String getSecond() {
        return second;
    }

    public DisplayFormats setSecond(String second) {
        this.second = second;
        return this;
    }

    public String getMinute() {
        return minute;
    }

    public DisplayFormats setMinute(String minute) {
        this.minute = minute;
        return this;
    }

    public String getHour() {
        return hour;
    }

    public DisplayFormats setHour(String hour) {
        this.hour = hour;
        return this;
    }

    public String getDay() {
        return day;
    }

    public DisplayFormats setDay(String day) {
        this.day = day;
        return this;
    }

    public String getWeek() {
        return week;
    }

    public DisplayFormats setWeek(String week) {
        this.week = week;
        return this;
    }

    public String getMonth() {
        return month;
    }

    public DisplayFormats setMonth(String month) {
        this.month = month;
        return this;
    }

    public String getQuarter() {
        return quarter;
    }

    public DisplayFormats setQuarter(String quarter) {
        this.quarter = quarter;
        return this;
    }

    public String getYear() {
        return year;
    }

    public DisplayFormats setYear(String year) {
        this.year = year;
        return this;
    }

}
