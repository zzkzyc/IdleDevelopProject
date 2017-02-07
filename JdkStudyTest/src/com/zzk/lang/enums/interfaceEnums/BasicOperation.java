/**
 * qccr.com Inc.
 * Copyright (c) 2014-2016 All Rights Reserved.
 */
package com.zzk.lang.enums.interfaceEnums;

/**
 * ${DESCRIPTION}
 *
 * @author zhouzongkun
 * @version $$Id: IdleDevelopProject, v 0.1 2016/6/20 19:17 zhouzongkun Exp $$
 */
public enum BasicOperation implements Operation {
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    };

    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }
}
