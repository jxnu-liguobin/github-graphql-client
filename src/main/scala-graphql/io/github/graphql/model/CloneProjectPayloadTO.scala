package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class CloneProjectPayloadTO(
    clientMutationId: String,
    jobStatusId: String,
    project: ProjectTO
) {

    override def toString(): String = {
        Seq(
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (jobStatusId != null) "jobStatusId: " + GraphQLRequestSerializer.getEntry(jobStatusId) else "",
            if (project != null) "project: " + GraphQLRequestSerializer.getEntry(project) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CloneProjectPayloadTO {

    def builder(): CloneProjectPayloadTO.Builder = new Builder()

    class Builder {

        private var clientMutationId: String = _
        private var jobStatusId: String = _
        private var project: ProjectTO = _

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setJobStatusId(jobStatusId: String): Builder = {
            this.jobStatusId = jobStatusId
            this
        }

        def setProject(project: ProjectTO): Builder = {
            this.project = project
            this
        }

        def build(): CloneProjectPayloadTO = new CloneProjectPayloadTO(clientMutationId, jobStatusId, project)

    }
}
