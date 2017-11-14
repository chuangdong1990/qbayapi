package com.optimus.controller;

import com.optimus.model.ResultInfo;
import com.optimus.service.RPCInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Dongchuang on 2017/11/14.
 */
@Controller
public class DubboController {
    @Autowired
    private RPCInterface rpcInterface;
    @RequestMapping("/dubbo")
    @ResponseBody
    public String errorNginxTest(){
        ResultInfo resultInfo=rpcInterface.getRPCInfo();
        return "result:"+resultInfo.getResultInfo();
    }
}
