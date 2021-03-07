package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for CreatedRepositoryOrRestrictedContribution
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class CreatedRepositoryOrRestrictedContributionResponseProjection extends GraphQLResponseProjection {

    override def all$(): CreatedRepositoryOrRestrictedContributionResponseProjection = all$(3)

    override def all$(maxDepth: Int): CreatedRepositoryOrRestrictedContributionResponseProjection = {
        this.typename()
        this
    }

    def onRestrictedContribution(subProjection: RestrictedContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection = {
        onRestrictedContribution(null.asInstanceOf[String], subProjection)
    }

    def onRestrictedContribution(alias: String, subProjection: RestrictedContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on RestrictedContribution").alias(alias).projection(subProjection))
        this
    }

    def onCreatedRepositoryContribution(subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection = {
        onCreatedRepositoryContribution(null.asInstanceOf[String], subProjection)
    }

    def onCreatedRepositoryContribution(alias: String, subProjection: CreatedRepositoryContributionResponseProjection): CreatedRepositoryOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("...on CreatedRepositoryContribution").alias(alias).projection(subProjection))
        this
    }

    def typename(): CreatedRepositoryOrRestrictedContributionResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): CreatedRepositoryOrRestrictedContributionResponseProjection = {
        fields.add(new GraphQLResponseField("__typename").alias(alias))
        this
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CreatedRepositoryOrRestrictedContributionResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
