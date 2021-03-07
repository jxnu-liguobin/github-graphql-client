package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class SponsorshipOrderTO(
    val direction: OrderDirectionTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction))
        return joiner.toString()
    }

    class Builder {

        private lateinit var direction: OrderDirectionTO

        fun setDirection(direction: OrderDirectionTO): Builder {
            this.direction = direction
            return this
        }

        fun build(): SponsorshipOrderTO {
            return SponsorshipOrderTO(direction)
        }
    }
}
