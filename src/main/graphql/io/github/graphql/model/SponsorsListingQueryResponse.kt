package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SponsorsListingQueryResponse : GraphQLResult<MutableMap<String, SponsorsListingTO?>>() {

    companion object {
        const val OPERATION_NAME: String = "sponsorsListing"
    }

    fun sponsorsListing(): SponsorsListingTO? {
        val data: MutableMap<String, SponsorsListingTO?> = super.getData()
        return data[OPERATION_NAME]
    }
}
