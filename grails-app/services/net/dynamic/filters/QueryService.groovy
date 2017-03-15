package net.dynamic.filters

import grails.transaction.Transactional
import net.dynamic.filters.properties.PossibleOperators
import net.dynamic.filters.query.QueryElement
import net.dynamic.filters.query.TypeOperator

@Transactional
class QueryService {

    Set<QueryElement> query = []

    Collection<QueryElement> addCondition(String field, TypeOperator operator, value  ) {
        query << new QueryElement(propertyName: field, operator: operator, value: value)
    }
}
