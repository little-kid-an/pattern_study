package org.gxa.builder.dslbuilderdemo;

/**
 * @author Guo Xi'an
 * @version $Id: Demo.java, v 0.1 2025-08-27 16:12 dongsheng.hds Exp $$
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(SQL.update().table("user").set("name", "dongsheng").set("age", "18").where("id = 1").build());
        System.out.println(SQL.select().from("user").where("id = 1").and("name = 'dongsheng'").and("age = 18").build());
        SQL.update().table("user").set("name", "dongsheng").where("id = 1").build();
        System.out.println(SQL.update().table("user").set("name", "dongsheng.hds").where("id = 1").and("age = 18").build());
        System.out.println(SQL.insert().into("user").values("name", "dongsheng").values("age", "18").build());
        System.out.println(SQL.delete().from("user").where("id = 1").and("name = 'dongsheng'").build());
    }
}