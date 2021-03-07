package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ChangeUserStatusMutationRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "changeUserStatus"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.MUTATION

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setInput(input: ChangeUserStatusInputTO) {
        this.input["input"] = input
    }

    override fun getOperationType(): GraphQLOperation = OPERATION_TYPE

    override fun getOperationName(): String = OPERATION_NAME

    override fun getAlias(): String? = alias ?: OPERATION_NAME

    override fun getInput(): MutableMap<String, Any?> = input

    override fun getUseObjectMapperForInputSerialization(): MutableSet<String> = useObjectMapperForInputSerialization

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private lateinit var input: ChangeUserStatusInputTO

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setInput(input: ChangeUserStatusInputTO): Builder {
            this.input = input
            return this
        }

        fun build(): ChangeUserStatusMutationRequest {
            val obj = ChangeUserStatusMutationRequest(`$alias`)
            obj.setInput(input)
            return obj
        }

    }
}
