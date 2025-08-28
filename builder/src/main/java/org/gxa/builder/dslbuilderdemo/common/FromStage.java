package org.gxa.builder.dslbuilderdemo.common;

/**
 * @author Guo Xi'an
 * @version $Id: FromStage.java, v 0.1 2025-08-27 18:19 dongsheng.hds Exp $$
 */
public interface FromStage {
    WhereStage from(String table);
}