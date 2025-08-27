/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.delete;

import org.gxa.builder.DSLBuilderDemo.BuildStage;

/**
 * @author Guo Xi'an
 */
public class DeleteBuilder implements FromStage, WhereStage, BuildStage {
    private String table;
    private String where;

    @Override
    public WhereStage from(String table) {
        this.table = table;
        return this;
    }

    @Override
    public BuildStage where(String where) {
        this.where = where;
        return this;
    }

    @Override
    public String build() {
        StringBuilder sql = new StringBuilder("DELETE FROM ").append(table);
        if (where != null && !where.isEmpty()) {
            sql.append(" WHERE ").append(where);
        }
        return sql.toString();
    }
}
