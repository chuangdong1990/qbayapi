package com.optimus.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.optimus.model.ResultInfo;
import com.optimus.service.RPCInterface;
import org.springframework.stereotype.Component;

/**
 * RPC调用业务逻辑处理
 * Created by Dongchuang on 2017/11/14.
 */
@Component
public class RPCInterfaceImpl implements RPCInterface {
    @Reference(version = "1.0.0")
    RPCInterface rpcInterface;//调用远程接口的实现类

    @Override
    public ResultInfo getRPCInfo() {
        ResultInfo resultInfo=rpcInterface.getRPCInfo();
        return resultInfo;
    }
}
