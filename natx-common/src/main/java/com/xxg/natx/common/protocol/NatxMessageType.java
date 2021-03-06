package com.xxg.natx.common.protocol;

import com.xxg.natx.common.exception.NatxException;

/**
 * Created by wucao on 2019/3/2.
 */
public enum NatxMessageType {

    REGISTER(1),
    REGISTER_RESULT(2),
    CONNECTED(3),
    DISCONNECTED(4),
    DATA(5),
    KEEPALIVE(6);

    private int code;

    NatxMessageType(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static NatxMessageType valueOf(int code) throws NatxException {
        for (NatxMessageType item : NatxMessageType.values()) {
            if (item.code == code) {
                return item;
            }
        }
        throw new NatxException("NatxMessageType code error: " + code);
    }
}
