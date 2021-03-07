package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MarketplaceCategoryQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "marketplaceCategory"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setSlug(slug: String) {
        this.input["slug"] = slug
    }

    fun setUseTopicAliases(useTopicAliases: Boolean?) {
        this.input["useTopicAliases"] = useTopicAliases
    }

    override fun getOperationType(): GraphQLOperation = OPERATION_TYPE

    override fun getOperationName(): String = OPERATION_NAME

    override fun getAlias(): String? = alias ?: OPERATION_NAME

    override fun getInput(): MutableMap<String, Any?> = input

    override fun getUseObjectMapperForInputSerialization(): MutableSet<String> = useObjectMapperForInputSerialization

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private lateinit var slug: String
        private var useTopicAliases: Boolean? = null

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setSlug(slug: String): Builder {
            this.slug = slug
            return this
        }
        fun setUseTopicAliases(useTopicAliases: Boolean?): Builder {
            this.useTopicAliases = useTopicAliases
            return this
        }

        fun build(): MarketplaceCategoryQueryRequest {
            val obj = MarketplaceCategoryQueryRequest(`$alias`)
            obj.setSlug(slug)
            obj.setUseTopicAliases(useTopicAliases)
            return obj
        }

    }
}
