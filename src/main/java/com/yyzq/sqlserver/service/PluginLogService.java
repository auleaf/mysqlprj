package com.yyzq.sqlserver.service;

import com.yyzq.sqlserver.model.PluginLog;
import java.util.ArrayList;

public interface PluginLogService {
    public ArrayList<PluginLog> select();
    public int deleteByProjectID(String projectID);
    public int insert(PluginLog pluginLog);
}
