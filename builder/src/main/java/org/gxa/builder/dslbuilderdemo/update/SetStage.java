package org.gxa.builder.dslbuilderdemo.update;

/**
 * @author Guo Xi'an
 * @version $Id: SetStage.java, v 0.1 2025-08-27 16:20 dongsheng.hds Exp $$
 */
public interface SetStage {
    UpWhereStage set(String column, String value);
}