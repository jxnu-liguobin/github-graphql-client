package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import ReportedContentClassifiersTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class MinimizeCommentInputTO(
    @javax.validation.constraints.NotNull
    classifier: ReportedContentClassifiersTO,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    subjectId: String
) {

    override def toString(): String = {
        Seq(
            if (classifier != null) "classifier: " + GraphQLRequestSerializer.getEntry(classifier) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (subjectId != null) "subjectId: " + GraphQLRequestSerializer.getEntry(subjectId) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object MinimizeCommentInputTO {

    def builder(): MinimizeCommentInputTO.Builder = new Builder()

    class Builder {

        private var classifier: ReportedContentClassifiersTO = _
        private var clientMutationId: String = _
        private var subjectId: String = _

        def setClassifier(classifier: ReportedContentClassifiersTO): Builder = {
            this.classifier = classifier
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setSubjectId(subjectId: String): Builder = {
            this.subjectId = subjectId
            this
        }

        def build(): MinimizeCommentInputTO = new MinimizeCommentInputTO(classifier, clientMutationId, subjectId)

    }
}
