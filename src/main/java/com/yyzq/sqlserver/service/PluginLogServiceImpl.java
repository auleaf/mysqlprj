package com.yyzq.sqlserver.service;

import com.yyzq.sqlserver.mapper.PluginLogMapper;
import com.yyzq.sqlserver.model.PluginLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class PluginLogServiceImpl implements PluginLogService{
    @Autowired
    PluginLogMapper pluginLogMapper;

    @Override
    public ArrayList<PluginLog> select() {
        return pluginLogMapper.select();
    }

    @Override
    public int deleteByProjectID(String projectID) {
        return pluginLogMapper.deleteeByProjectID(projectID);
    }

    @Override
    public int insert(PluginLog pluginLog) {
        return pluginLogMapper.insert(pluginLog);
    }
}
