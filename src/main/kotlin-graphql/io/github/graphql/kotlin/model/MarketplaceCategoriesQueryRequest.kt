package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class MarketplaceCategoriesQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "marketplaceCategories"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setExcludeEmpty(excludeEmpty: Boolean?) {
        this.input["excludeEmpty"] = excludeEmpty
    }

    fun setExcludeSubcategories(excludeSubcategories: Boolean?) {
        this.input["excludeSubcategories"] = excludeSubcategories
    }

    fun setIncludeCategories(includeCategories: List<String>?) {
        this.input["includeCategories"] = includeCategories
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
        val that = other as MarketplaceCategoriesQueryRequest
        return Objects.equals(operationType, that.operationType) &&
                   Objects.equals(operationName, that.operationName) &&
                   Objects.equals(input, that.input)
    }

    override fun hashCode(): Int = Objects.hash(operationType, operationName, input)

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private var excludeEmpty: Boolean? = null
        private var excludeSubcategories: Boolean? = null
        private var includeCategories: List<String>? = null

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setExcludeEmpty(excludeEmpty: Boolean?): Builder {
            this.excludeEmpty = excludeEmpty
            return this
        }
        fun setExcludeSubcategories(excludeSubcategories: Boolean?): Builder {
            this.excludeSubcategories = excludeSubcategories
            return this
        }
        fun setIncludeCategories(includeCategories: List<String>?): Builder {
            this.includeCategories = includeCategories
            return this
        }

        fun build(): MarketplaceCategoriesQueryRequest {
            val obj = MarketplaceCategoriesQueryRequest(`$alias`)
            obj.setExcludeEmpty(excludeEmpty)
            obj.setExcludeSubcategories(excludeSubcategories)
            obj.setIncludeCategories(includeCategories)
            return obj
        }

    }
}
