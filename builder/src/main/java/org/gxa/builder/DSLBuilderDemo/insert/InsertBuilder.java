/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.insert;

import org.gxa.builder.DSLBuilderDemo.BuildStage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guo Xi'an
 */
public class InsertBuilder implements IntoStage, ValuesStage, BuildStage {
    private String table;
    private final List<String> columns = new ArrayList<>();
    private final List<String> values = new ArrayList<>();

    @Override
    public ValuesStage into(String table) {
        this.table = table;
        return this;
    }

    @Override
    public ValuesStage values(String column, String value) {
        this.columns.add(column);
        this.values.add(value);
        return this;
    }

    @Override
    public String build() {
        StringBuilder sql = new StringBuilder("INSERT INTO ").append(table).append(" (");
        sql.append(String.join(", ", columns));
        sql.append(") VALUES (");
        sql.append(String.join(", ", values));
        sql.append(")");
        return sql.toString();
    }
}
