package com.yyzq.sqlserver.model;

import java.io.Serializable;

public class PluginLog  implements Serializable {
    String EIM;
    String date;
    String time;
    String workflowID;
    String projectID;

    public PluginLog() {

    }

    public String getEIM() {
        return EIM;
    }

    public void setEIM(String EIM) {
        this.EIM = EIM;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWorkflowID() {
        return workflowID;
    }

    public void setWorkflowID(String workflowID) {
        this.workflowID = workflowID;
    }

    public String getProjectID() {
        return projectID;
    }

    public void setProjectID(String projectID) {
        this.projectID = projectID;
    }


}
