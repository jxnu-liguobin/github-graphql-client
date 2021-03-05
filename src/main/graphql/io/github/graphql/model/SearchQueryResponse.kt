package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class SearchQueryResponse : GraphQLResult<MutableMap<String, SearchResultItemConnectionTO>>() {

    companion object {
        const val OPERATION_NAME: String = "search"
    }

    fun search(): SearchResultItemConnectionTO {
        val data: MutableMap<String, SearchResultItemConnectionTO> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
