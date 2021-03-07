package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class NodeQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "node"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setId(id: String) {
        this.input["id"] = id
    }

    override fun getOperationType(): GraphQLOperation = OPERATION_TYPE

    override fun getOperationName(): String = OPERATION_NAME

    override fun getAlias(): String? = alias ?: OPERATION_NAME

    override fun getInput(): MutableMap<String, Any?> = input

    override fun getUseObjectMapperForInputSerialization(): MutableSet<String> = useObjectMapperForInputSerialization

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private lateinit var id: String

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun build(): NodeQueryRequest {
            val obj = NodeQueryRequest(`$alias`)
            obj.setId(id)
            return obj
        }

    }
}