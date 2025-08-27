/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.select;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guo Xi'an
 * @version $Id: SelectBuilder.java, v 0.1 2025-08-27 16:15 dongsheng.hds Exp $$
 */
public class SelectBuilder implements FromStage, WhereStage, AndStage {
    private String table;
    private final String[] columns;
    private final List<String> conditions = new ArrayList<>();

    public SelectBuilder(String[] columns) {
        this.columns = columns;
    }

    @Override
    public WhereStage from(String table) {
        this.table = table;
        return this;
    }

    @Override
    public AndStage where(String where) {
        this.conditions.add(where);
        return this;
    }

    @Override
    public AndStage and(String condition) {
        this.conditions.add(condition);
        return this;
    }

    @Override
    public String build() {
        StringBuilder sql = new StringBuilder("SELECT ");
        if (columns == null || columns.length == 0) {
            sql.append("*");
        } else {
            sql.append(String.join(", ", columns));
        }
        sql.append(" FROM ").append(table);
        if (!conditions.isEmpty()) {
            sql.append(" WHERE ").append(String.join(" AND ", conditions));
        }
        return sql.toString();
    }

}