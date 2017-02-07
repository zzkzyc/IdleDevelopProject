/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.design.patterns.d_command;

/**
 * 粘贴命令
 *
 * @author zhouzongkun@qccr.com
 * @since $Revision:1.0.0,$Date: 2016/12/8 16:38 Exp $
 */
public class PasteCommandImpl implements Command {

    private PasteReceiver pasteReceiver;

    public PasteCommandImpl(PasteReceiver pasteReceiver) {
        this.pasteReceiver = pasteReceiver;
    }

    @Override
    public void execute() {
        pasteReceiver.doPaste();
    }
}
