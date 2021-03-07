package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class ProjectOrderTO(
    val direction: OrderDirectionTO,
    val field: ProjectOrderFieldTO
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

    class Builder {

        private lateinit var direction: OrderDirectionTO
        private lateinit var field: ProjectOrderFieldTO

        fun setDirection(direction: OrderDirectionTO): Builder {
            this.direction = direction
            return this
        }

        fun setField(field: ProjectOrderFieldTO): Builder {
            this.field = field
            return this
        }

        fun build(): ProjectOrderTO {
            return ProjectOrderTO(direction, field)
        }
    }
}
