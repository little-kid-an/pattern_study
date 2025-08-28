package org.gxa.builder.dslbuilderdemo;

import org.gxa.builder.dslbuilderdemo.common.FromStage;
import org.gxa.builder.dslbuilderdemo.delete.DeleteBuilder;
import org.gxa.builder.dslbuilderdemo.insert.InsertBuilder;
import org.gxa.builder.dslbuilderdemo.insert.IntoStage;
import org.gxa.builder.dslbuilderdemo.select.SelectBuilder;
import org.gxa.builder.dslbuilderdemo.update.TableStage;
import org.gxa.builder.dslbuilderdemo.update.UpdateBuilder;

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
    public static IntoStage insert() {
        return new InsertBuilder();
    }
    public static FromStage delete() {
        return new DeleteBuilder();
    }

}