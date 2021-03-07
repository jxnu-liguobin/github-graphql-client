package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[CloneProjectPayloadTO]
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(jobStatusId, that.jobStatusId) &&
        Objects.equals(project, that.project)
    }

    override def hashCode(): Int = {
        Objects.hash(clientMutationId, jobStatusId, project)
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
