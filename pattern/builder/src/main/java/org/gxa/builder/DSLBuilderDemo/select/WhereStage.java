/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.select;

/**
 * @author Guo Xi'an
 * @version $Id: WhereStage.java, v 0.1 2025-08-27 18:19 dongsheng.hds Exp $$
 */
public interface WhereStage {
    AndStage where(String condition);
}