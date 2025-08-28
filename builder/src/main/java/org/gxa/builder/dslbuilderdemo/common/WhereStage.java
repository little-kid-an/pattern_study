package org.gxa.builder.dslbuilderdemo.common;

/**
 * @author Guo Xi'an
 * @version $Id: UpWhereStage.java, v 0.1 2025-08-27 18:19 dongsheng.hds Exp $$
 */
public interface WhereStage {
    AndStage where(String condition);
}