package net.dynamic.filters.properties

import net.dynamic.filters.query.TypeOperator

/**
 * Created by claudiomanuelfernandezbarreiro on 15/3/17.
 */
enum PossibleOperators {
    STRING(String, [TypeOperator.EQ, TypeOperator.DISTINCT])

    Class type
    List options

    PossibleOperators(Class type, List options) {
        this.type = type
        this.options = options
    }

}