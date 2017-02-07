/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.d_command;

/**
 * 复制命令
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/8 16:22 Exp $
 */
public class CopyCommandImpl implements Command{

    private CopyReceiver receiver;

    public CopyCommandImpl(CopyReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.doCopy();
    }
}
