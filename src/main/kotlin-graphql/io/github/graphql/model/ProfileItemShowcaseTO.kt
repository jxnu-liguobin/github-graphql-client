package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class ProfileItemShowcaseTO(
    val hasPinnedItems: Boolean
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("hasPinnedItems: " + GraphQLRequestSerializer.getEntry(hasPinnedItems))
        return joiner.toString()
    }

    class Builder {

        private var hasPinnedItems: Boolean = false

        fun setHasPinnedItems(hasPinnedItems: Boolean): Builder {
            this.hasPinnedItems = hasPinnedItems
            return this
        }

        fun build(): ProfileItemShowcaseTO {
            return ProfileItemShowcaseTO(hasPinnedItems)
        }
    }
}
