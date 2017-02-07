/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.d_command;

/**
 * 快速复制粘贴
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/8 17:15 Exp $
 */
public class FastPasteCommandImpl implements Command {

    private CopyReceiver copyReceiver;
    private PasteReceiver pasteReceiver;

    public FastPasteCommandImpl(CopyReceiver copyReceiver, PasteReceiver pasteReceiver) {
        this.copyReceiver = copyReceiver;
        this.pasteReceiver = pasteReceiver;
    }

    @Override
    public void execute() {
        copyReceiver.doCopy();
        pasteReceiver.doPaste();
    }
}
