/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.select;

import org.gxa.builder.DSLBuilderDemo.BuildStage;

/**
 * @author Guo Xi'an
 * @version $Id: AndStage.java, v 0.1 2025-08-27 18:20 dongsheng.hds Exp $$
 */
public interface AndStage {
    AndStage and(String condition);
    String build();
}