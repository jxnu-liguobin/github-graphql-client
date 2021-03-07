package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class SubmitPullRequestReviewMutationRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "submitPullRequestReview"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setInput(input: SubmitPullRequestReviewInputTO) {
        this.input["input"] = input
    }

    override fun getOperationType(): GraphQLOperation = OPERATION_TYPE

    override fun getOperationName(): String = OPERATION_NAME

    override fun getAlias(): String? = alias ?: OPERATION_NAME

    override fun getInput(): MutableMap<String, Any?> = input

    override fun getUseObjectMapperForInputSerialization(): MutableSet<String> = useObjectMapperForInputSerialization

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as SubmitPullRequestReviewMutationRequest
        return Objects.equals(operationType, that.operationType) &&
                   Objects.equals(operationName, that.operationName) &&
                   Objects.equals(input, that.input)
    }

    override fun hashCode(): Int = Objects.hash(operationType, operationName, input)

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private lateinit var input: SubmitPullRequestReviewInputTO

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setInput(input: SubmitPullRequestReviewInputTO): Builder {
            this.input = input
            return this
        }

        fun build(): SubmitPullRequestReviewMutationRequest {
            val obj = SubmitPullRequestReviewMutationRequest(`$alias`)
            obj.setInput(input)
            return obj
        }

    }
}
