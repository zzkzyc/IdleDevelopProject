/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang.enums;

/**
 * ${DESCRIPTION}
 *
 * @author zhouzongkun
 * @version $$Id: IdleDevelopProject, v 0.1 2016/6/17 15:43 zhouzongkun Exp $$
 */
public enum Ensemble {
    SOLO(1),
    DUET(2);

    private final int numberOfMusicians;

    Ensemble(int size) {
        this.numberOfMusicians = size;
    }

    public int getNumberOfMusicians() {
        return numberOfMusicians;
    }
}
