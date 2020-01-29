package io.netty.example.study.common;

/**
 * Created by Administrator on 2020/1/29/029.
 */
public class ResponseMessage extends Message<OperationResult> {

    public Class getMessageBodyDecodeClass(int opcode) {
        return OperationType.fromOpcode(opcode).getOperationResultClazz();
    }
}