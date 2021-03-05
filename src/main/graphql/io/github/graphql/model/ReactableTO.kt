package io.github.graphql.model


@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:08:59+0800"
)
interface ReactableTO {

    val databaseId: Int?

    val id: String

    val reactionGroups: List<ReactionGroupTO>?

    val viewerCanReact: Boolean

}
