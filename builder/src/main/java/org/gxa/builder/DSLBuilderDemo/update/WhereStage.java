/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.update;

import org.gxa.builder.DSLBuilderDemo.BuildStage;

/**
 * @author Guo Xi'an
 * @version $Id: WhereStage.java, v 0.1 2025-08-27 16:20 dongsheng.hds Exp $$
 */
public interface WhereStage {
    WhereStage set(String column, String value);
    BuildStage where(String where);
}