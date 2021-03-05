package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SearchQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "search"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY
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

    override fun toString(): String = Objects.toString(input)

}
