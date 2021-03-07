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
class AddPullRequestReviewMutationRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setInput(input: AddPullRequestReviewInputTO): Unit = {
        this.input.put("input", input)
    }

    override def getOperationType(): GraphQLOperation = AddPullRequestReviewMutationRequest.OPERATION_TYPE

    override def getOperationName(): String = AddPullRequestReviewMutationRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else AddPullRequestReviewMutationRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object AddPullRequestReviewMutationRequest {

    final val OPERATION_NAME: String = "addPullRequestReview"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

    def apply(alias: String) = new AddPullRequestReviewMutationRequest(alias)

    def apply() = new AddPullRequestReviewMutationRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var input: AddPullRequestReviewInputTO = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setInput(input: AddPullRequestReviewInputTO): Builder = {
            this.input = input
            this
        }

        def build(): AddPullRequestReviewMutationRequest = {
            val obj = new AddPullRequestReviewMutationRequest($alias)
            obj.setInput(input)
            obj
        }

    }
}
