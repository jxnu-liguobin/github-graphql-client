package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection

/**
 * Response projection for ChangeUserStatusPayload
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-05T19:09:00+0800"
)
open class ChangeUserStatusPayloadResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ChangeUserStatusPayloadResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ChangeUserStatusPayloadResponseProjection {
        this.clientMutationId()
        if (projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0) <= maxDepth) {
            projectionDepthOnFields["ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status"] = projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0) + 1
            this.status(UserStatusResponseProjection().`all$`(maxDepth - projectionDepthOnFields.getOrDefault("ChangeUserStatusPayloadResponseProjection.UserStatusResponseProjection.status", 0)))
        }
        this.typename()
        return this
    }

    fun clientMutationId(): ChangeUserStatusPayloadResponseProjection = clientMutationId(null)

    fun clientMutationId(alias: String?): ChangeUserStatusPayloadResponseProjection {
        fields.add(GraphQLResponseField("clientMutationId").alias(alias))
        return this
    }

    fun status(subProjection: UserStatusResponseProjection): ChangeUserStatusPayloadResponseProjection = status(null, subProjection)

    fun status(alias: String?, subProjection: UserStatusResponseProjection): ChangeUserStatusPayloadResponseProjection {
        fields.add(GraphQLResponseField("status").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ChangeUserStatusPayloadResponseProjection = typename(null)

    fun typename(alias: String?): ChangeUserStatusPayloadResponseProjection {
        fields.add(GraphQLResponseField("__typename").alias(alias))
        return this
    }


}
