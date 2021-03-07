package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for DeleteBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class DeleteBranchProtectionRulePayloadResponseProjection extends GraphQLResponseProjection {

    override def all$(): DeleteBranchProtectionRulePayloadResponseProjection = all$(3)

    override def all$(maxDepth: Int): DeleteBranchProtectionRulePayloadResponseProjection = {
        this.clientMutationId()
        this.typename()
        this
    }

    def clientMutationId(): DeleteBranchProtectionRulePayloadResponseProjection = {
        clientMutationId(null.asInstanceOf[String])
    }

    def clientMutationId(alias: String): DeleteBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("clientMutationId").alias(alias))
        this
    }

    def typename(): DeleteBranchProtectionRulePayloadResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): DeleteBranchProtectionRulePayloadResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }


}
