package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as ProfileItemShowcaseTO
        return Objects.equals(hasPinnedItems, that.hasPinnedItems)

    }

    override fun hashCode(): Int = {
        return Objects.hash(hasPinnedItems)
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
