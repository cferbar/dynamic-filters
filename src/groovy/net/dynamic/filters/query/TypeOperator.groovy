package net.dynamic.filters.query

/**
 * Created by claudiomanuelfernandezbarreiro on 15/3/17.
 */
enum TypeOperator {
    EQ("equals",{property, value -> eq property, value}),
    DISTINCT("distinct", {property, value -> ne property, value})


    String name
    def code

    TypeOperator(String name, def code) {
        this.name = name
        this.code = code
    }

}