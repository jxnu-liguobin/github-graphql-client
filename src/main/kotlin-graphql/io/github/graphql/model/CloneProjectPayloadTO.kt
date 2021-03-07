package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.StringJoiner

@javax.annotation.Generated(
    value = ["com.kobylynskyi.graphql.codegen.GraphQLCodegen"],
    date = "2021-03-06T19:48:04+0800"
)
open class CloneProjectPayloadTO(
    val clientMutationId: String?,
    val jobStatusId: String?,
    val project: ProjectTO?
) {

    companion object {
        fun builder(): Builder = Builder()
    }

    // In the future, it maybe change.
    override fun toString(): String {
        val joiner = StringJoiner(", ", "{ ", " }")
        if (clientMutationId != null) {
            joiner.add("clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId))
        }
        if (jobStatusId != null) {
            joiner.add("jobStatusId: " + GraphQLRequestSerializer.getEntry(jobStatusId))
        }
        if (project != null) {
            joiner.add("project: " + GraphQLRequestSerializer.getEntry(project))
        }
        return joiner.toString()
    }

    class Builder {

        private var clientMutationId: String? = null
        private var jobStatusId: String? = null
        private var project: ProjectTO? = null

        fun setClientMutationId(clientMutationId: String?): Builder {
            this.clientMutationId = clientMutationId
            return this
        }

        fun setJobStatusId(jobStatusId: String?): Builder {
            this.jobStatusId = jobStatusId
            return this
        }

        fun setProject(project: ProjectTO?): Builder {
            this.project = project
            return this
        }

        fun build(): CloneProjectPayloadTO {
            return CloneProjectPayloadTO(clientMutationId, jobStatusId, project)
        }
    }
}
