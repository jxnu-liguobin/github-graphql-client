package io.github.graphql.model


@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
interface CommentTO {

    val author: ActorTO?

    val authorAssociation: CommentAuthorAssociationTO

    val body: String

    val bodyHTML: String

    val bodyText: String

    val createdAt: String

    val createdViaEmail: Boolean

    val editor: ActorTO?

    val id: String

    val includesCreatedEdit: Boolean

    val lastEditedAt: String?

    val publishedAt: String?

    val updatedAt: String

    val viewerDidAuthor: Boolean

}
