package org.gxa.builder.dslbuilderdemo.update;

import org.gxa.builder.dslbuilderdemo.common.WhereStage;

/**
 * @author Guo Xi'an
 * @version $Id: UpWhereStage.java, v 0.1 2025-08-27 16:20 dongsheng.hds Exp $$
 */
public interface UpWhereStage extends WhereStage {
    UpWhereStage set(String column, String value);
}