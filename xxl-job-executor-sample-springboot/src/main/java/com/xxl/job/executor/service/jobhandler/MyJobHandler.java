package com.xxl.job.executor.service.jobhandler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * @author fueen
 * 编写自己的定时任务Handler
 * 继承IJobHandler
 *
 */
@Component
public class MyJobHandler extends IJobHandler {
    /**
     * 重写execute方法，里面执行相应的功能
     * @param param
     * @return
     * @throws Exception
     */
    @Override
    @XxlJob("lycTest")
    public ReturnT<String> execute(String param) throws Exception {
        System.out.println("我们不能失去信仰");
        return SUCCESS;
    }
}