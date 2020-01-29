package io.netty.example.study.order;

import io.netty.example.study.common.OperationResult;
import lombok.Data;

/**
 * Created by Administrator on 2020/1/28/028.
 */
@Data
public class OrderOperationResult extends OperationResult {

    private final int messageId;
    private final String orderMsg;
    private final boolean complete;
}