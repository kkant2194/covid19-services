package com.covid19.app.covid19service.dto;

import java.util.List;

public class AlertStatus {

    private String alertLevel;

    private List<String> measuresToBeTaken;

    private StateData summaryData;

    public StateData getSummaryData() {
        return summaryData;
    }

    public void setSummaryData(StateData summaryData) {
        this.summaryData = summaryData;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public List<String> getMeasuresToBeTaken() {
        return measuresToBeTaken;
    }

    public void setMeasuresToBeTaken(List<String> measuresToBeTaken) {
        this.measuresToBeTaken = measuresToBeTaken;
    }
}
