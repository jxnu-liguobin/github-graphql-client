package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:03+0800"
)
open class BlameTO(
    val ranges: List<BlameRangeTO>
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("ranges: " + GraphQLRequestSerializer.getEntry(ranges))
        return joiner.toString()
    }

    class Builder {

        private lateinit var ranges: List<BlameRangeTO>

        fun setRanges(ranges: List<BlameRangeTO>): Builder {
            this.ranges = ranges
            return this
        }

        fun build(): BlameTO {
            return BlameTO(ranges)
        }
    }
}
