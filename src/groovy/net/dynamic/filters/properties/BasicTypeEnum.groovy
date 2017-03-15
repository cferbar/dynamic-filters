package net.dynamic.filters.properties

/**
 * Created by claudiomanuelfernandezbarreiro on 13/3/17.
 */
enum BasicTypeEnum {
    STRING(String.class),
    INTEGER(Integer.class),
    BOOLEAN(Boolean.class)

    Class classType

    BasicTypeEnum (Class classType) {
        this.classType = classType
    }

}