package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class PageInfoTO(
    val endCursor: String?,
    val hasNextPage: Boolean,
    val hasPreviousPage: Boolean,
    val startCursor: String?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (endCursor != null) {
            joiner.add("endCursor: " + GraphQLRequestSerializer.getEntry(endCursor))
        }
        joiner.add("hasNextPage: " + GraphQLRequestSerializer.getEntry(hasNextPage))
        joiner.add("hasPreviousPage: " + GraphQLRequestSerializer.getEntry(hasPreviousPage))
        if (startCursor != null) {
            joiner.add("startCursor: " + GraphQLRequestSerializer.getEntry(startCursor))
        }
        return joiner.toString()
    }

    class Builder {

        private var endCursor: String? = null
        private var hasNextPage: Boolean = false
        private var hasPreviousPage: Boolean = false
        private var startCursor: String? = null

        fun setEndCursor(endCursor: String?): Builder {
            this.endCursor = endCursor
            return this
        }

        fun setHasNextPage(hasNextPage: Boolean): Builder {
            this.hasNextPage = hasNextPage
            return this
        }

        fun setHasPreviousPage(hasPreviousPage: Boolean): Builder {
            this.hasPreviousPage = hasPreviousPage
            return this
        }

        fun setStartCursor(startCursor: String?): Builder {
            this.startCursor = startCursor
            return this
        }

        fun build(): PageInfoTO {
            return PageInfoTO(endCursor, hasNextPage, hasPreviousPage, startCursor)
        }
    }
}
