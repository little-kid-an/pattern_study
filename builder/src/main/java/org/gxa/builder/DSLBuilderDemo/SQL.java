/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo;

import org.gxa.builder.DSLBuilderDemo.delete.DeleteBuilder;
import org.gxa.builder.DSLBuilderDemo.insert.InsertBuilder;
import org.gxa.builder.DSLBuilderDemo.insert.IntoStage;
import org.gxa.builder.DSLBuilderDemo.select.SelectBuilder;
import org.gxa.builder.DSLBuilderDemo.update.UpdateBuilder;

/**
 * @author Guo Xi'an
 * @description: 高级建造者模式
 */
public class SQL {
    private SQL() {}
    public static org.gxa.builder.DSLBuilderDemo.select.FromStage select(String... columns) {
        return new SelectBuilder(columns);
    }
    public static org.gxa.builder.DSLBuilderDemo.update.TableStage update() {
        return new UpdateBuilder();
    }
    public static IntoStage insert() {
        return new InsertBuilder();
    }
    public static org.gxa.builder.DSLBuilderDemo.delete.FromStage delete() {
        return new DeleteBuilder();
    }

}