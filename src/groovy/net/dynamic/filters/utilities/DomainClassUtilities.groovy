package net.dynamic.filters.utilities

import grails.util.Holders
import net.dynamic.filters.properties.BasicTypeEnum
import org.codehaus.groovy.grails.commons.DefaultGrailsDomainClass
import org.codehaus.groovy.grails.commons.GrailsDomainClassProperty

/**
 * Created by claudiomanuelfernandezbarreiro on 13/3/17.
 */
class DomainClassUtilities {

    static boolean isFullyQualified(String className) {
        return className.contains(".")
    }

    static DefaultGrailsDomainClass getDomainClassFromName(String className) {
        if (isFullyQualified(className))
            return Holders.grailsApplication.getDomainClass(className)
        else {
            return Holders.grailsApplication.domainClasses.find{it.clazz.simpleName == className}
        }
    }

    static List<GrailsDomainClassProperty> getProperties(String className, BasicTypeEnum type = null) {
        DefaultGrailsDomainClass domainClass = getDomainClassFromName(className)
        if (type) {
            domainClass.persistentProperties.findAll {prop -> prop.type == type.classType }
        } else {
            domainClass.persistentProperties
        }
    }
}
