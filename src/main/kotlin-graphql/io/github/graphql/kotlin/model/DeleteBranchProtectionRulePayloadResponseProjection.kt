package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for DeleteBranchProtectionRulePayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class DeleteBranchProtectionRulePayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): DeleteBranchProtectionRulePayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): DeleteBranchProtectionRulePayloadResponseProjection {
        this.clientMutationId()
        this.typename()
        return this
    }

    fun clientMutationId(): DeleteBranchProtectionRulePayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): DeleteBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun typename(): DeleteBranchProtectionRulePayloadResponseProjection = typename(null)

    fun typename(alias: String?): DeleteBranchProtectionRulePayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as DeleteBranchProtectionRulePayloadResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
