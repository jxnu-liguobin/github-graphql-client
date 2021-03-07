package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResult

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class MetaQueryResponse : GraphQLResult<MutableMap<String, GitHubMetadataTO>>() {

    companion object {
        const val OPERATION_NAME: String = "meta"
    }

    fun meta(): GitHubMetadataTO {
        val data: MutableMap<String, GitHubMetadataTO> = super.getData()
        return data.getValue(OPERATION_NAME)
    }
}
