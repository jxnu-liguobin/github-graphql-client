package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import ReactionContentTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class ReactionTO(
    @javax.validation.constraints.NotNull
    content: ReactionContentTO,
    @javax.validation.constraints.NotNull
    createdAt: String,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    reactable: ReactableTO,
    user: UserTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (content != null) "content: " + GraphQLRequestSerializer.getEntry(content) else "",
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (reactable != null) "reactable: " + GraphQLRequestSerializer.getEntry(reactable) else "",
            if (user != null) "user: " + GraphQLRequestSerializer.getEntry(user) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ReactionTO]
        Objects.equals(content, that.content) &&
        Objects.equals(createdAt, that.createdAt) &&
        Objects.equals(databaseId, that.databaseId) &&
        Objects.equals(id, that.id) &&
        Objects.equals(reactable, that.reactable) &&
        Objects.equals(user, that.user)
    }

    override def hashCode(): Int = {
        Objects.hash(content, createdAt, databaseId, id, reactable, user)
    }
}

object ReactionTO {

    def builder(): ReactionTO.Builder = new Builder()

    class Builder {

        private var content: ReactionContentTO = _
        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var id: String = _
        private var reactable: ReactableTO = _
        private var user: UserTO = _

        def setContent(content: ReactionContentTO): Builder = {
            this.content = content
            this
        }

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setDatabaseId(databaseId: Option[Int]): Builder = {
            this.databaseId = databaseId
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setReactable(reactable: ReactableTO): Builder = {
            this.reactable = reactable
            this
        }

        def setUser(user: UserTO): Builder = {
            this.user = user
            this
        }

        def build(): ReactionTO = new ReactionTO(content, createdAt, databaseId, id, reactable, user)

    }
}
