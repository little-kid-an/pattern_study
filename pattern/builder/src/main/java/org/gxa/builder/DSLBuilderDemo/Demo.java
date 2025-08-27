/**
 * TNG Digital Sdn Bhd
 * Copyright (c) 2017-2025 All Rights Reserved.
 */
package org.gxa.builder.DSLBuilderDemo;

/**
 * @author Guo Xi'an
 * @version $Id: Demo.java, v 0.1 2025-08-27 16:12 dongsheng.hds Exp $$
 */
public class Demo {
    public static void main(String[] args) {
//        System.out.println(SQL.select("id", "name").from("user").where("id = 1").build());
        System.out.println(SQL.update().table("user").set("name", "dongsheng").set("age", "18").where("id = 1").build());
        System.out.println(SQL.select().from("user").where("id = 1").and("name = 'dongsheng'").and("age = 18").build());
        SQL.update().table("user").set("name", "dongsheng").where("id = 1").build();

    }
}