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
class RemoveLabelsFromLabelableMutationRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setInput(input: RemoveLabelsFromLabelableInputTO): Unit = {
        this.input.put("input", input)
    }

    override def getOperationType(): GraphQLOperation = RemoveLabelsFromLabelableMutationRequest.OPERATION_TYPE

    override def getOperationName(): String = RemoveLabelsFromLabelableMutationRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else RemoveLabelsFromLabelableMutationRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RemoveLabelsFromLabelableMutationRequest]
        Objects.equals(getOperationType(), that.getOperationType()) &&
                   Objects.equals(getOperationName(), that.getOperationName()) &&
                   Objects.equals(input, that.input)
    }

    override def hashCode(): Int = Objects.hash(getOperationType(), getOperationName(), input)

    override def toString(): String = Objects.toString(input)
}

object RemoveLabelsFromLabelableMutationRequest {

    final val OPERATION_NAME: String = "removeLabelsFromLabelable"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

    def apply(alias: String) = new RemoveLabelsFromLabelableMutationRequest(alias)

    def apply() = new RemoveLabelsFromLabelableMutationRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var input: RemoveLabelsFromLabelableInputTO = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setInput(input: RemoveLabelsFromLabelableInputTO): Builder = {
            this.input = input
            this
        }

        def build(): RemoveLabelsFromLabelableMutationRequest = {
            val obj = new RemoveLabelsFromLabelableMutationRequest($alias)
            obj.setInput(input)
            obj
        }

    }
}
