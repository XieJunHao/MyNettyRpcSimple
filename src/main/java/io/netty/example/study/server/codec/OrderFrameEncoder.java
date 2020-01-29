package io.netty.example.study.server.codec;

import io.netty.handler.codec.LengthFieldPrepender;

/**
 * Created by Administrator on 2020/1/29/029.
 * 为客户端接受解决ByteBuf半包、粘包问题
 * 告诉构造器使用两个字节保存信息长度
 */
public class OrderFrameEncoder extends LengthFieldPrepender {

    public OrderFrameEncoder() {
        super(2);
    }
}