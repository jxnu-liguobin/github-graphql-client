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
class RelayQueryRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    override def getOperationType(): GraphQLOperation = RelayQueryRequest.OPERATION_TYPE

    override def getOperationName(): String = RelayQueryRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else RelayQueryRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object RelayQueryRequest {

    final val OPERATION_NAME: String = "relay"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

    def apply(alias: String) = new RelayQueryRequest(alias)

    def apply() = new RelayQueryRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }


        def build(): RelayQueryRequest = {
            val obj = new RelayQueryRequest($alias)
            obj
        }

    }
}
