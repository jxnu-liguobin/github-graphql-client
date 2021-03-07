package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestChangedFile
 */
@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class PullRequestChangedFileResponseProjection extends GraphQLResponseProjection {

    override def all$(): PullRequestChangedFileResponseProjection = all$(3)

    override def all$(maxDepth: Int): PullRequestChangedFileResponseProjection = {
        this.additions()
        this.deletions()
        this.path()
        this.typename()
        this
    }

    def additions(): PullRequestChangedFileResponseProjection = {
        additions(null.asInstanceOf[String])
    }

    def additions(alias: String): PullRequestChangedFileResponseProjection = {
        fields.add(new GraphQLResponseField("additions").alias(alias))
        this
    }

    def deletions(): PullRequestChangedFileResponseProjection = {
        deletions(null.asInstanceOf[String])
    }

    def deletions(alias: String): PullRequestChangedFileResponseProjection = {
        fields.add(new GraphQLResponseField("deletions").alias(alias))
        this
    }

    def path(): PullRequestChangedFileResponseProjection = {
        path(null.asInstanceOf[String])
    }

    def path(alias: String): PullRequestChangedFileResponseProjection = {
        fields.add(new GraphQLResponseField("path").alias(alias))
        this
    }

    def typename(): PullRequestChangedFileResponseProjection = {
        typename(null.asInstanceOf[String])
    }

    def typename(alias: String): PullRequestChangedFileResponseProjection = {
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
        val that = obj.asInstanceOf[PullRequestChangedFileResponseProjection]
        Objects.equals(fields, that.fields)
    }

    override def hashCode(): Int = Objects.hash(fields)

}
