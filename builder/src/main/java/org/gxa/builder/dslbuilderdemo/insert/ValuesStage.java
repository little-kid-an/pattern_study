package org.gxa.builder.dslbuilderdemo.insert;

import org.gxa.builder.dslbuilderdemo.common.BuildStage;

/**
 * @author Guo Xi'an
 */
public interface ValuesStage extends BuildStage {
    ValuesStage values(String column, String value);
}
