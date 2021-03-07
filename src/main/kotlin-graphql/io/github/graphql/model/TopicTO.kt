package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class TopicTO(
    override
    val id: String,
    val name: String,
    override
    val viewerHasStarred: Boolean
) : StarrableTO, NodeTO {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("id: " + GraphQLRequestSerializer.getEntry(id))
        joiner.add("name: " + GraphQLRequestSerializer.getEntry(name))
        joiner.add("viewerHasStarred: " + GraphQLRequestSerializer.getEntry(viewerHasStarred))
        return joiner.toString()
    }

    class Builder {

        private lateinit var id: String
        private lateinit var name: String
        private var viewerHasStarred: Boolean = false

        fun setId(id: String): Builder {
            this.id = id
            return this
        }

        fun setName(name: String): Builder {
            this.name = name
            return this
        }

        fun setViewerHasStarred(viewerHasStarred: Boolean): Builder {
            this.viewerHasStarred = viewerHasStarred
            return this
        }

        fun build(): TopicTO {
            return TopicTO(id, name, viewerHasStarred)
        }
    }
}
