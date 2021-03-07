package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class MarketplaceListingsQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "marketplaceListings"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY

        fun builder(): Builder = Builder()
    }

    private val input: MutableMap<String, Any?> = LinkedHashMap()
    private val useObjectMapperForInputSerialization: MutableSet<String> = HashSet()

    constructor(): this(null)

    fun setAdminId(adminId: String?) {
        this.input["adminId"] = adminId
    }

    fun setAfter(after: String?) {
        this.input["after"] = after
    }

    fun setAllStates(allStates: Boolean?) {
        this.input["allStates"] = allStates
    }

    fun setBefore(before: String?) {
        this.input["before"] = before
    }

    fun setCategorySlug(categorySlug: String?) {
        this.input["categorySlug"] = categorySlug
    }

    fun setFirst(first: Int?) {
        this.input["first"] = first
    }

    fun setLast(last: Int?) {
        this.input["last"] = last
    }

    fun setOrganizationId(organizationId: String?) {
        this.input["organizationId"] = organizationId
    }

    fun setPrimaryCategoryOnly(primaryCategoryOnly: Boolean?) {
        this.input["primaryCategoryOnly"] = primaryCategoryOnly
    }

    fun setSlugs(slugs: List<String?>?) {
        this.input["slugs"] = slugs
    }

    fun setUseTopicAliases(useTopicAliases: Boolean?) {
        this.input["useTopicAliases"] = useTopicAliases
    }

    fun setViewerCanAdmin(viewerCanAdmin: Boolean?) {
        this.input["viewerCanAdmin"] = viewerCanAdmin
    }

    fun setWithFreeTrialsOnly(withFreeTrialsOnly: Boolean?) {
        this.input["withFreeTrialsOnly"] = withFreeTrialsOnly
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
        val that = other as MarketplaceListingsQueryRequest
        return Objects.equals(operationType, that.operationType) &&
                   Objects.equals(operationName, that.operationName) &&
                   Objects.equals(input, that.input)
    }

    override fun hashCode(): Int = Objects.hash(operationType, operationName, input)

    override fun toString(): String = Objects.toString(input)

    class Builder {

        private var `$alias`: String? = null
        private var adminId: String? = null
        private var after: String? = null
        private var allStates: Boolean? = null
        private var before: String? = null
        private var categorySlug: String? = null
        private var first: Int? = null
        private var last: Int? = null
        private var organizationId: String? = null
        private var primaryCategoryOnly: Boolean? = false
        private var slugs: List<String?>? = null
        private var useTopicAliases: Boolean? = null
        private var viewerCanAdmin: Boolean? = null
        private var withFreeTrialsOnly: Boolean? = false

        fun alias(alias: String?): Builder {
            this.`$alias` = alias
            return this
        }

        fun setAdminId(adminId: String?): Builder {
            this.adminId = adminId
            return this
        }
        fun setAfter(after: String?): Builder {
            this.after = after
            return this
        }
        fun setAllStates(allStates: Boolean?): Builder {
            this.allStates = allStates
            return this
        }
        fun setBefore(before: String?): Builder {
            this.before = before
            return this
        }
        fun setCategorySlug(categorySlug: String?): Builder {
            this.categorySlug = categorySlug
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
        fun setOrganizationId(organizationId: String?): Builder {
            this.organizationId = organizationId
            return this
        }
        fun setPrimaryCategoryOnly(primaryCategoryOnly: Boolean?): Builder {
            this.primaryCategoryOnly = primaryCategoryOnly
            return this
        }
        fun setSlugs(slugs: List<String?>?): Builder {
            this.slugs = slugs
            return this
        }
        fun setUseTopicAliases(useTopicAliases: Boolean?): Builder {
            this.useTopicAliases = useTopicAliases
            return this
        }
        fun setViewerCanAdmin(viewerCanAdmin: Boolean?): Builder {
            this.viewerCanAdmin = viewerCanAdmin
            return this
        }
        fun setWithFreeTrialsOnly(withFreeTrialsOnly: Boolean?): Builder {
            this.withFreeTrialsOnly = withFreeTrialsOnly
            return this
        }

        fun build(): MarketplaceListingsQueryRequest {
            val obj = MarketplaceListingsQueryRequest(`$alias`)
            obj.setAdminId(adminId)
            obj.setAfter(after)
            obj.setAllStates(allStates)
            obj.setBefore(before)
            obj.setCategorySlug(categorySlug)
            obj.setFirst(first)
            obj.setLast(last)
            obj.setOrganizationId(organizationId)
            obj.setPrimaryCategoryOnly(primaryCategoryOnly)
            obj.setSlugs(slugs)
            obj.setUseTopicAliases(useTopicAliases)
            obj.setViewerCanAdmin(viewerCanAdmin)
            obj.setWithFreeTrialsOnly(withFreeTrialsOnly)
            return obj
        }

    }
}
