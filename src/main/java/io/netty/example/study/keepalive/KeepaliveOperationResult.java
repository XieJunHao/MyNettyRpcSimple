package io.netty.example.study.keepalive;

import io.netty.example.study.common.OperationResult;
import lombok.Data;

/**
 * Created by Administrator on 2020/1/28/028.
 */
@Data
public class KeepaliveOperationResult extends OperationResult {

    private final long time;
}