package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class RegistryPackageVersionStatisticsTO(
    val downloadsThisMonth: Int,
    val downloadsThisWeek: Int,
    val downloadsThisYear: Int,
    val downloadsToday: Int,
    val downloadsTotalCount: Int
) {

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("downloadsThisMonth: " + GraphQLRequestSerializer.getEntry(downloadsThisMonth))
        joiner.add("downloadsThisWeek: " + GraphQLRequestSerializer.getEntry(downloadsThisWeek))
        joiner.add("downloadsThisYear: " + GraphQLRequestSerializer.getEntry(downloadsThisYear))
        joiner.add("downloadsToday: " + GraphQLRequestSerializer.getEntry(downloadsToday))
        joiner.add("downloadsTotalCount: " + GraphQLRequestSerializer.getEntry(downloadsTotalCount))
        return joiner.toString()
    }
}
