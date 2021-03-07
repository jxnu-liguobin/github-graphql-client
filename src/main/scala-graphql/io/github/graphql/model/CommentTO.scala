package io.github.graphql.model

import CommentAuthorAssociationTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
trait CommentTO {

    val author: ActorTO

    @javax.validation.constraints.NotNull
    val authorAssociation: CommentAuthorAssociationTO

    @javax.validation.constraints.NotNull
    val body: String

    @javax.validation.constraints.NotNull
    val bodyHTML: String

    @javax.validation.constraints.NotNull
    val bodyText: String

    @javax.validation.constraints.NotNull
    val createdAt: String

    val createdViaEmail: Boolean

    val editor: ActorTO

    @javax.validation.constraints.NotNull
    val id: String

    val includesCreatedEdit: Boolean

    val lastEditedAt: String

    val publishedAt: String

    @javax.validation.constraints.NotNull
    val updatedAt: String

    val viewerDidAuthor: Boolean

}
