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
class AddPullRequestReviewCommentMutationRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setInput(input: AddPullRequestReviewCommentInputTO): Unit = {
        this.input.put("input", input)
    }

    override def getOperationType(): GraphQLOperation = AddPullRequestReviewCommentMutationRequest.OPERATION_TYPE

    override def getOperationName(): String = AddPullRequestReviewCommentMutationRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else AddPullRequestReviewCommentMutationRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object AddPullRequestReviewCommentMutationRequest {

    final val OPERATION_NAME: String = "addPullRequestReviewComment"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

    def apply(alias: String) = new AddPullRequestReviewCommentMutationRequest(alias)

    def apply() = new AddPullRequestReviewCommentMutationRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var input: AddPullRequestReviewCommentInputTO = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setInput(input: AddPullRequestReviewCommentInputTO): Builder = {
            this.input = input
            this
        }

        def build(): AddPullRequestReviewCommentMutationRequest = {
            val obj = new AddPullRequestReviewCommentMutationRequest($alias)
            obj.setInput(input)
            obj
        }

    }
}
