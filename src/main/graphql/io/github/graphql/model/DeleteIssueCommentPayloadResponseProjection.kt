package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteIssueCommentPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class DeleteIssueCommentPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeleteIssueCommentPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeleteIssueCommentPayloadResponseProjection {
        this.clientMutationId()
        this.typename()
        return this
    }

    fun clientMutationId(): DeleteIssueCommentPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeleteIssueCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): DeleteIssueCommentPayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeleteIssueCommentPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
