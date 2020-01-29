package io.netty.example.study.order;

import io.netty.example.study.common.Operation;
import io.netty.example.study.common.OperationResult;
import lombok.Data;
import lombok.extern.java.Log;

/**
 * Created by Administrator on 2020/1/28/028.
 * 处理业务逻辑类
 */
@Data
@Log
public class OrderOperation extends Operation {

    private int messageId;
    private String orderMsg;

    public OrderOperation(int messageId, String orderMsg) {
        this.messageId = messageId;
        this.orderMsg = orderMsg;
    }

    public OperationResult execute() {
        log.info("接收到指令：" + orderMsg);
        //execute order logic
        log.info("完成指令!");
        return new OrderOperationResult(messageId,orderMsg,true);
    }
}