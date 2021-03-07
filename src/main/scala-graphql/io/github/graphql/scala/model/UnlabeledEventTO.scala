package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class UnlabeledEventTO(
    actor: ActorTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    label: LabelTO,
    @javax.validation.constraints.NotNull
    labelable: LabelableTO
) extends IssueTimelineItemsTO with PullRequestTimelineItemsTO with IssueTimelineItemTO with PullRequestTimelineItemTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (actor != null) "actor: " + GraphQLRequestSerializer.getEntry(actor) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (label != null) "label: " + GraphQLRequestSerializer.getEntry(label) else "",
            if (labelable != null) "labelable: " + GraphQLRequestSerializer.getEntry(labelable) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[UnlabeledEventTO]
        Objects.equals(actor, that.actor) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(id, that.id) &&
        Objects.equals(label, that.label) &&
        Objects.equals(labelable, that.labelable)
    }

    override def hashCode(): Int = {
        Objects.hash(actor, createdAt, id, label, labelable)
    }
}

object UnlabeledEventTO {

    def builder(): UnlabeledEventTO.Builder = new Builder()

    class Builder {

        private var actor: ActorTO = _
        private var createdAt: String = _
        private var id: String = _
        private var label: LabelTO = _
        private var labelable: LabelableTO = _

        def setActor(actor: ActorTO): Builder = {
            this.actor = actor
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setLabel(label: LabelTO): Builder = {
            this.label = label
            this
        }

        def setLabelable(labelable: LabelableTO): Builder = {
            this.labelable = labelable
            this
        }

        def build(): UnlabeledEventTO = new UnlabeledEventTO(actor, createdAt, id, label, labelable)

    }
}
