package org.gxa.builder.dslbuilderdemo.common;

/**
 * @author Guo Xi'an
 * @version $Id: AndStage.java, v 0.1 2025-08-27 18:20 dongsheng.hds Exp $$
 */
public interface AndStage extends BuildStage{
    AndStage and(String condition);
}