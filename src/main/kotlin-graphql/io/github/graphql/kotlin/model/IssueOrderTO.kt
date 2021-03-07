package io.github.graphql.kotlin.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-07T19:48:14+0800"
)
open class IssueOrderTO(
    val direction: OrderDirectionTO,
    val field: IssueOrderFieldTO
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("direction: " + GraphQLRequestSerializer.getEntry(direction))
        joiner.add("field: " + GraphQLRequestSerializer.getEntry(field))
        return joiner.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other == null || javaClass != other.javaClass) {
            return false
        }
        val that = other as IssueOrderTO
        return Objects.equals(direction, that.direction)
                && Objects.equals(field, that.field)

    }

    override fun hashCode(): Int = {
        return Objects.hash(direction, field)
    }

    class Builder {

        private lateinit var direction: OrderDirectionTO
        private lateinit var field: IssueOrderFieldTO

        fun setDirection(direction: OrderDirectionTO): Builder {
            this.direction = direction
            return this
        }

        fun setField(field: IssueOrderFieldTO): Builder {
            this.field = field
            return this
        }

        fun build(): IssueOrderTO {
            return IssueOrderTO(direction, field)
        }
    }
}
