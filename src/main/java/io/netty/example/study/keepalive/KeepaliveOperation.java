package io.netty.example.study.keepalive;

import io.netty.example.study.common.Operation;
import io.netty.example.study.common.OperationResult;
import lombok.Data;
import lombok.extern.java.Log;

/**
 * Created by Administrator on 2020/1/28/028.
 * 检验在活
 */
@Data
@Log
public class KeepaliveOperation extends Operation {

    private long time;

    public KeepaliveOperation() {
        this.time = System.nanoTime();
    }


    public OperationResult execute() {
        return new KeepaliveOperationResult(time);
    }
}