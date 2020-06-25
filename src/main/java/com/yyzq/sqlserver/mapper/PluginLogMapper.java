package com.yyzq.sqlserver.mapper;

import com.yyzq.sqlserver.model.PluginLog;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
@Mapper
public interface PluginLogMapper {
    @Select("select * from PluginLog")
    public ArrayList<PluginLog> select();

    @Delete("delete from PluginLog where projectID=#{projectID}")
    public int deleteeByProjectID(@Param("projectID") String projectID);

    @Insert("insert into PluginLog(EIM, date, time, workflowID, projectID) values(#{EIM},#{date},#{time},#{workflowID},#{projectID})")
    public int insert(PluginLog pluginLog);
}
