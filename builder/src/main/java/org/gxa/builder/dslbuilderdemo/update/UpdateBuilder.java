package org.gxa.builder.dslbuilderdemo.update;

import org.gxa.builder.dslbuilderdemo.common.AndStage;
import org.gxa.builder.dslbuilderdemo.common.BuildStage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Guo Xi'an
 * @version $Id: UpdateBuilder.java, v 0.1 2025-08-27 16:14 dongsheng.hds Exp $$
 */
public class UpdateBuilder implements TableStage, SetStage, UpWhereStage, AndStage {
    private String table;
    private final Map<String, String> setMap = new LinkedHashMap<>();
    private final List<String> conditions = new ArrayList<>();

    @Override
    public UpWhereStage set(String column, String value) {
        setMap.put(column, value);
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
    public UpdateBuilder table(String table) {
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
        if (!conditions.isEmpty()) {
            sql.append(" WHERE ").append(String.join(" AND ", conditions));
        }
        return sql.toString();
    }
}