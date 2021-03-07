package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class CommitContributionsByRepositoryTO(
    val repository: RepositoryTO,
    val resourcePath: String,
    val url: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("repository: " + GraphQLRequestSerializer.getEntry(repository))
        joiner.add("resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath))
        joiner.add("url: " + GraphQLRequestSerializer.getEntry(url))
        return joiner.toString()
    }

    class Builder {

        private lateinit var repository: RepositoryTO
        private lateinit var resourcePath: String
        private lateinit var url: String

        fun setRepository(repository: RepositoryTO): Builder {
            this.repository = repository
            return this
        }

        fun setResourcePath(resourcePath: String): Builder {
            this.resourcePath = resourcePath
            return this
        }

        fun setUrl(url: String): Builder {
            this.url = url
            return this
        }

        fun build(): CommitContributionsByRepositoryTO {
            return CommitContributionsByRepositoryTO(repository, resourcePath, url)
        }
    }
}
