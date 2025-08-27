/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.update;

import org.gxa.builder.DSLBuilderDemo.BuildStage;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Guo Xi'an
 * @version $Id: UpdateBuilder.java, v 0.1 2025-08-27 16:14 dongsheng.hds Exp $$
 */
public class UpdateBuilder implements TableStage, SetStage, WhereStage, BuildStage {
    private String table;
    private Map<String, String> setMap = new LinkedHashMap<>();
    private String where;

    @Override
    public WhereStage set(String column, String value) {
        setMap.put(column, value);
        return this;
    }

    @Override
    public BuildStage where(String where) {
        this.where = where;
        return this;
    }

    @Override
    public SetStage table(String table) {
        this.table = table;
        return this;
    }

    @Override
    public String build() {
        StringBuilder sql = new StringBuilder("UPDATE ").append(table).append(" SET ");
        for (Map.Entry<String, String> entry : setMap.entrySet()) {
            sql.append(entry.getKey()).append(" = ").append(entry.getValue()).append(", ");
        }
        sql.delete(sql.length() - 2, sql.length());
        if (where != null && !where.isEmpty()) {
            sql.append(" WHERE ").append(where);
        }
        return sql.toString();
    }
}