/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.select;

import org.gxa.builder.DSLBuilderDemo.select.WhereStage;

/**
 * @author Guo Xi'an
 * @version $Id: FromStage.java, v 0.1 2025-08-27 18:19 dongsheng.hds Exp $$
 */
public interface FromStage {
    WhereStage from(String table);
}