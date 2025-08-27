/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo;

import org.gxa.builder.DSLBuilderDemo.select.FromStage;
import org.gxa.builder.DSLBuilderDemo.select.SelectBuilder;
import org.gxa.builder.DSLBuilderDemo.update.TableStage;
import org.gxa.builder.DSLBuilderDemo.update.UpdateBuilder;

/**
 * @author Guo Xi'an
 * @description: 高级建造者模式
 */
public class SQL {
    private SQL() {}
    public static FromStage select(String... columns) {
        return new SelectBuilder(columns);
    }
    public static TableStage update() {
        return new UpdateBuilder();
    }

}