package io.netty.example.study.common;

/**
 * Created by Administrator on 2020/1/28/028.
 */
public abstract class Operation extends MessageBody {

    public abstract OperationResult execute();
}