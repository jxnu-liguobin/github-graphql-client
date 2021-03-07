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
class UpdateProjectCardMutationRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setInput(input: UpdateProjectCardInputTO): Unit = {
        this.input.put("input", input)
    }

    override def getOperationType(): GraphQLOperation = UpdateProjectCardMutationRequest.OPERATION_TYPE

    override def getOperationName(): String = UpdateProjectCardMutationRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else UpdateProjectCardMutationRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object UpdateProjectCardMutationRequest {

    final val OPERATION_NAME: String = "updateProjectCard"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

    def apply(alias: String) = new UpdateProjectCardMutationRequest(alias)

    def apply() = new UpdateProjectCardMutationRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var input: UpdateProjectCardInputTO = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setInput(input: UpdateProjectCardInputTO): Builder = {
            this.input = input
            this
        }

        def build(): UpdateProjectCardMutationRequest = {
            val obj = new UpdateProjectCardMutationRequest($alias)
            obj.setInput(input)
            obj
        }

    }
}
