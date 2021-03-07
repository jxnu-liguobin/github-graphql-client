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
class UnresolveReviewThreadMutationRequest(alias: String) extends GraphQLOperationRequest {

    private final lazy val input = new JLinkedHashMap[String, java.lang.Object]()
    private final lazy val useObjectMapperForInputSerialization: mutable.Set[String] = mutable.Set()

    def setInput(input: UnresolveReviewThreadInputTO): Unit = {
        this.input.put("input", input)
    }

    override def getOperationType(): GraphQLOperation = UnresolveReviewThreadMutationRequest.OPERATION_TYPE

    override def getOperationName(): String = UnresolveReviewThreadMutationRequest.OPERATION_NAME

    override def getAlias(): String = if (alias != null) alias else UnresolveReviewThreadMutationRequest.OPERATION_NAME

    override def getInput(): JMap[String, java.lang.Object] = input

    override def getUseObjectMapperForInputSerialization(): java.util.Set[String] = useObjectMapperForInputSerialization.asJava

    override def toString(): String = Objects.toString(input)
}

object UnresolveReviewThreadMutationRequest {

    final val OPERATION_NAME: String = "unresolveReviewThread"
    final val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

    def apply(alias: String) = new UnresolveReviewThreadMutationRequest(alias)

    def apply() = new UnresolveReviewThreadMutationRequest(null)


    def builder(): Builder = new Builder()

    class Builder {

        private var $alias: String = _
        private var input: UnresolveReviewThreadInputTO = _

        def alias(alias: String): Builder = {
            this.$alias = alias
            this
        }

        def setInput(input: UnresolveReviewThreadInputTO): Builder = {
            this.input = input
            this
        }

        def build(): UnresolveReviewThreadMutationRequest = {
            val obj = new UnresolveReviewThreadMutationRequest($alias)
            obj.setInput(input)
            obj
        }

    }
}