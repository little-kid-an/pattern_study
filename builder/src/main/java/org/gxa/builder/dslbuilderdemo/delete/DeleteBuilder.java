package org.gxa.builder.dslbuilderdemo.delete;

import org.gxa.builder.dslbuilderdemo.common.AndStage;
import org.gxa.builder.dslbuilderdemo.common.BuildStage;
import org.gxa.builder.dslbuilderdemo.common.FromStage;
import org.gxa.builder.dslbuilderdemo.common.WhereStage;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Guo Xi'an
 */
public class DeleteBuilder implements FromStage, WhereStage, AndStage {
    private String table;
    private final List<String> conditions = new ArrayList<>();

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
        StringBuilder sql = new StringBuilder("DELETE FROM ").append(table);
        if (!conditions.isEmpty()) {
            sql.append(" WHERE ").append(String.join(" AND ", conditions));
        }
        return sql.toString();
    }
}
