package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperation
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLOperationRequest
import java.util.Objects

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class MarketplaceListingsQueryRequest(private val alias: String?) : GraphQLOperationRequest {

    companion object {
        const val OPERATION_NAME: String = "marketplaceListings"
        val OPERATION_TYPE: GraphQLOperation = GraphQLOperation.QUERY
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

    override fun toString(): String = Objects.toString(input)

}
