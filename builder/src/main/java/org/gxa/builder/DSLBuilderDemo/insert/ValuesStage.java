/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo.insert;

/**
 * @author Guo Xi'an
 */
public interface ValuesStage {
    ValuesStage values(String column, String value);
    String build();
}
