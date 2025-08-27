/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.update;

/**
 * @author Guo Xi'an
 * @version $Id: SetStage.java, v 0.1 2025-08-27 16:20 dongsheng.hds Exp $$
 */
public interface SetStage {
    WhereStage set(String column, String value);
}