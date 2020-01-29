package io.netty.example.study.util;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Administrator on 2020/1/29/029.
 * ID生成类
 */
public final class IdUtil {

    //原子操作
    private static final AtomicLong IDX = new AtomicLong();

    public static long nextId() {
        return IDX.incrementAndGet();
    }

    private IdUtil() {
        //no instance
    }
}