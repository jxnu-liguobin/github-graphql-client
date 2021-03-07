package io.github.graphql.scala.model

import CommentCannotUpdateReasonTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
trait UpdatableCommentTO {

    @javax.validation.constraints.NotNull
    val viewerCannotUpdateReasons: Seq[CommentCannotUpdateReasonTO]

}
