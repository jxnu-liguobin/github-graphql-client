package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.{ LinkedHashMap => JLinkedHashMap }
import java.util.{ Map => JMap }
import java.util.Objects
import scala.collection.mutable
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class LicenseQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setKey(key: String): Unit = {
        this.input.put("key", key)
    }

    override def getOperationType(): GraphQLOperation = LicenseQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = LicenseQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else LicenseQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object LicenseQueryRequest {

    final val OPERATION_NAME: String = "license"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new LicenseQueryRequest(alias)

    def apply() = new LicenseQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var key: String = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setKey(key: String): Builder = {
            this.key = key
            this
        }

        def build(): LicenseQueryRequest = {
            val obj = new LicenseQueryRequest($alias)
            obj.setKey(key)
            obj
        }

    }
}
