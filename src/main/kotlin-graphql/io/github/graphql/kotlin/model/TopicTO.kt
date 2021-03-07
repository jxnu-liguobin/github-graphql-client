package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as TopicTO
        return Objects.equals(id, that.id)
                && Objects.equals(name, that.name)
                && Objects.equals(viewerHasStarred, that.viewerHasStarred)

    }

    override fun hashCode(): Int = {
        return Objects.hash(id, name, viewerHasStarred)
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
