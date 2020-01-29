package io.netty.example.study.common;

import lombok.Data;

/**
 * Created by Administrator on 2020/1/28/028.
 */
@Data
public class MessageHeader {

    //先默认为1
    public int version = 1;
    public int opCode;
    public long streamId;
}