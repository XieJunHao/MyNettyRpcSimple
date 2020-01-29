package io.netty.example.study.common;

import lombok.Data;

/**
 * Created by Administrator on 2020/1/28/028.
 * 操作结果
 * lombok的@Data放在抽象类，子类能够继承特性
 */
@Data
public abstract class OperationResult extends MessageBody {
}