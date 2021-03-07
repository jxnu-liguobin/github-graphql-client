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
class RepositoryQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setName(name: String): Unit = {
        this.input.put("name", name)
    }

    def setOwner(owner: String): Unit = {
        this.input.put("owner", owner)
    }

    override def getOperationType(): GraphQLOperation = RepositoryQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = RepositoryQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else RepositoryQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object RepositoryQueryRequest {

    final val OPERATION_NAME: String = "repository"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new RepositoryQueryRequest(alias)

    def apply() = new RepositoryQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var name: String = _
        private var owner: String = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }
        def setOwner(owner: String): Builder = {
            this.owner = owner
            this
        }

        def build(): RepositoryQueryRequest = {
            val obj = new RepositoryQueryRequest($alias)
            obj.setName(name)
            obj.setOwner(owner)
            obj
        }

    }
}
