package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteIssueCommentPayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class DeleteIssueCommentPayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeleteIssueCommentPayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeleteIssueCommentPayloadResponseProjection = {
        this.clientMutationId()
        this.typename()
        this
    }

    def clientMutationId(): DeleteIssueCommentPayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeleteIssueCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def typename(): DeleteIssueCommentPayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeleteIssueCommentPayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
