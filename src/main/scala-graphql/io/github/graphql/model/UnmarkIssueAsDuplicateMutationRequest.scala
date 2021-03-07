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
class UnmarkIssueAsDuplicateMutationRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setInput(input: UnmarkIssueAsDuplicateInputTO): Unit = {
        this.input.put("input", input)
    }

    override def getOperationType(): GraphQLOperation = UnmarkIssueAsDuplicateMutationRequest.OPERATION_TYPE

    override def getOperationName(): String = UnmarkIssueAsDuplicateMutationRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else UnmarkIssueAsDuplicateMutationRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object UnmarkIssueAsDuplicateMutationRequest {

    final val OPERATION_NAME: String = "unmarkIssueAsDuplicate"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

    def apply(alias: String) = new UnmarkIssueAsDuplicateMutationRequest(alias)

    def apply() = new UnmarkIssueAsDuplicateMutationRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var input: UnmarkIssueAsDuplicateInputTO = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setInput(input: UnmarkIssueAsDuplicateInputTO): Builder = {
            this.input = input
            this
        }

        def build(): UnmarkIssueAsDuplicateMutationRequest = {
            val obj = new UnmarkIssueAsDuplicateMutationRequest($alias)
            obj.setInput(input)
            obj
        }

    }
}
