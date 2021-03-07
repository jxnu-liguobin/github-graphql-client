package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class SearchQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "search"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setAfter(after: String?) {
        this.input["after"] = after
    }

    fun setBefore(before: String?) {
        this.input["before"] = before
    }

    fun setFirst(first: Int?) {
        this.input["first"] = first
    }

    fun setLast(last: Int?) {
        this.input["last"] = last
    }

    fun setQuery(query: String) {
        this.input["query"] = query
    }

    fun setType(type: SearchTypeTO) {
        this.input["type"] = type
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
        val that = other as SearchQueryRequest
        return Objects.equals(operationType, that.operationType) &&
                   Objects.equals(operationName, that.operationName) &&
                   Objects.equals(input, that.input)
    }

    override fun hashCode(): Int = Objects.hash(operationType, operationName, input)

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private var after: String? = null
        private var before: String? = null
        private var first: Int? = null
        private var last: Int? = null
        private lateinit var query: String
        private lateinit var type: SearchTypeTO

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setAfter(after: String?): Builder {
            this.after = after
            return this
        }
        fun setBefore(before: String?): Builder {
            this.before = before
            return this
        }
        fun setFirst(first: Int?): Builder {
            this.first = first
            return this
        }
        fun setLast(last: Int?): Builder {
            this.last = last
            return this
        }
        fun setQuery(query: String): Builder {
            this.query = query
            return this
        }
        fun setType(type: SearchTypeTO): Builder {
            this.type = type
            return this
        }

        fun build(): SearchQueryRequest {
            val obj = SearchQueryRequest(`$alias`)
            obj.setAfter(after)
            obj.setBefore(before)
            obj.setFirst(first)
            obj.setLast(last)
            obj.setQuery(query)
            obj.setType(type)
            return obj
        }

    }
}
