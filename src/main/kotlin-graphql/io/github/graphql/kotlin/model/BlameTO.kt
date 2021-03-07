package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:13+0800"
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as BlameTO
        return Objects.equals(ranges, that.ranges)

    }

    override fun hashCode(): Int = {
        return Objects.hash(ranges)
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
