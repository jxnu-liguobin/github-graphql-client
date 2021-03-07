package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for ReviewDismissalAllowanceActor
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class ReviewDismissalAllowanceActorResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): ReviewDismissalAllowanceActorResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): ReviewDismissalAllowanceActorResponseProjection {
        this.typename()
        return this
    }

    fun onUser(subProjection: UserResponseProjection): ReviewDismissalAllowanceActorResponseProjection = onUser(null, subProjection)

    fun onUser(alias: String?, subProjection: UserResponseProjection): ReviewDismissalAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("...on User").alias(alias).projection(subProjection))
        return this
    }

    fun onTeam(subProjection: TeamResponseProjection): ReviewDismissalAllowanceActorResponseProjection = onTeam(null, subProjection)

    fun onTeam(alias: String?, subProjection: TeamResponseProjection): ReviewDismissalAllowanceActorResponseProjection {
        fields.add(GraphQLResponseField("...on Team").alias(alias).projection(subProjection))
        return this
    }

    fun typename(): ReviewDismissalAllowanceActorResponseProjection = typename(null)

    fun typename(alias: String?): ReviewDismissalAllowanceActorResponseProjection {
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
        val that = other as ReviewDismissalAllowanceActorResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
