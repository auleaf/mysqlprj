package com.yyzq.sqlserver.controller;

import com.yyzq.sqlserver.model.PluginLog;
import com.yyzq.sqlserver.service.PluginLogService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags="Demo接口Api调用定义",value="/", description = "@description注解")//value会被tags代替
@RequestMapping("/v1") //此处的注释的作用是：需要在后续的所有的方法前加/V1
public class DemoController {
    @Autowired
    PluginLogService pluginLogService;

    @ResponseBody
    @ApiOperation(value="List all table data", httpMethod = "GET",notes="")
    @GetMapping("/list")
    public List<PluginLog> list(){
        return pluginLogService.select();
    }

    @ResponseBody
    @ApiOperation(value="delete table a record data where projectID define", httpMethod = "GET",notes="")
    @GetMapping("/delete")
    public String delete(String  projectID){
        int result = pluginLogService.deleteByProjectID(projectID);
        if(result>0)return "success";
        else{
            return "fail";
        }
    }

    @ResponseBody
    @ApiOperation(value="insert into table data ", httpMethod = "GET",notes="")
    @GetMapping("/insert")
    public String insert(PluginLog  pluginLog){
        int result = pluginLogService.insert(pluginLog);
        return String.valueOf(result);
    }
}
