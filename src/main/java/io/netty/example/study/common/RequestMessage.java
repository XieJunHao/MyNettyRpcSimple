package io.netty.example.study.common;

/**
 * Created by Administrator on 2020/1/29/029.
 */
public class RequestMessage extends Message<Operation> {


    public RequestMessage() {

    }

    public Class getMessageBodyDecodeClass(int opcode) {
        return OperationType.fromOpcode(opcode).getOperationClazz();
    }

    /**
     * 通过id和body来构造message
     *
     * @param streamId
     * @param operation
     */
    public RequestMessage(Long streamId, Operation operation) {
        MessageHeader messageHeader = new MessageHeader();
        messageHeader.setStreamId(streamId);
        messageHeader.setOpCode(OperationType.fromOperation(operation).getOpCode());
        this.setMessageHeader(messageHeader);
        this.setMessageBody(operation);
    }



}