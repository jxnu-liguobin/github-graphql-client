package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class MinimizeCommentInputTO(
    val classifier: ReportedContentClassifiersTO,
    val clientMutationId: String?,
    val subjectId: String
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        joiner.add("classifier: " + GraphQLRequestSerializer.getEntry(classifier))
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        joiner.add("subjectId: " + GraphQLRequestSerializer.getEntry(subjectId))
        return joiner.toString()
    }

    class Builder {

        private lateinit var classifier: ReportedContentClassifiersTO
        private var clientMutationId: String? = null
        private lateinit var subjectId: String

        fun setClassifier(classifier: ReportedContentClassifiersTO): Builder {
            this.classifier = classifier
            return this
        }

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setSubjectId(subjectId: String): Builder {
            this.subjectId = subjectId
            return this
        }

        fun build(): MinimizeCommentInputTO {
            return MinimizeCommentInputTO(classifier, clientMutationId, subjectId)
        }
    }
}
