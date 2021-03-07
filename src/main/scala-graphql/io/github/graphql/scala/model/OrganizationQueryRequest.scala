package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.{ LinkedHashMap => JLinkedHashMap }
import java.util.{ Map => JMap }
import java.util.Objects
import scala.collection.mutable
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class OrganizationQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setLogin(login: String): Unit = {
        this.input.put("login", login)
    }

    override def getOperationType(): GraphQLOperation = OrganizationQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = OrganizationQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else OrganizationQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[OrganizationQueryRequest]
        Objects.equals(getOperationType(), that.getOperationType()) &&
                   Objects.equals(getOperationName(), that.getOperationName()) &&
                   Objects.equals(input, that.input)
    }

    override def hashCode(): Int = Objects.hash(getOperationType(), getOperationName(), input)

    override def toString(): String = Objects.toString(input)
}

object OrganizationQueryRequest {

    final val OPERATION_NAME: String = "organization"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new OrganizationQueryRequest(alias)

    def apply() = new OrganizationQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var login: String = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setLogin(login: String): Builder = {
            this.login = login
            this
        }

        def build(): OrganizationQueryRequest = {
            val obj = new OrganizationQueryRequest($alias)
            obj.setLogin(login)
            obj
        }

    }
}
