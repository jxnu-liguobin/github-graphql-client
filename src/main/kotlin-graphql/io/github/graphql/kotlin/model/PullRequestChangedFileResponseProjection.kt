package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection
import java.util.Objects

/**
 * Response projection for PullRequestChangedFile
 */
@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
)
open class PullRequestChangedFileResponseProjection : GraphQLResponseProjection() {

    override fun `all$`(): PullRequestChangedFileResponseProjection = `all$`(3)

    override fun `all$`(maxDepth: Int): PullRequestChangedFileResponseProjection {
        this.additions()
        this.deletions()
        this.path()
        this.typename()
        return this
    }

    fun additions(): PullRequestChangedFileResponseProjection = additions(null)

    fun additions(alias: String?): PullRequestChangedFileResponseProjection {
        fields.add(GraphQLResponseField("additions").alias(alias))
        return this
    }

    fun deletions(): PullRequestChangedFileResponseProjection = deletions(null)

    fun deletions(alias: String?): PullRequestChangedFileResponseProjection {
        fields.add(GraphQLResponseField("deletions").alias(alias))
        return this
    }

    fun path(): PullRequestChangedFileResponseProjection = path(null)

    fun path(alias: String?): PullRequestChangedFileResponseProjection {
        fields.add(GraphQLResponseField("path").alias(alias))
        return this
    }

    fun typename(): PullRequestChangedFileResponseProjection = typename(null)

    fun typename(alias: String?): PullRequestChangedFileResponseProjection {
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
        val that = other as PullRequestChangedFileResponseProjection
        return Objects.equals(fields, that.fields)
    }

    override fun hashCode(): Int = Objects.hash(fields)

}
