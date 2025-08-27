/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.delete;

import org.gxa.builder.DSLBuilderDemo.BuildStage;

/**
 * @author Guo Xi'an
 */
public interface WhereStage {
    BuildStage where(String condition);
}
