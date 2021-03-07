package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class BotTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    databaseId: Option[Int],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    override val login: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    updatedAt: String,
    @javax.validation.constraints.NotNull
    override val url: String
) extends AssigneeTO with UniformResourceLocatableTO with NodeTO with ActorTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (databaseId.isDefined) "databaseId: " + GraphQLRequestSerializer.getEntry(databaseId.get) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (login != null) "login: " + GraphQLRequestSerializer.getEntry(login) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (updatedAt != null) "updatedAt: " + GraphQLRequestSerializer.getEntry(updatedAt) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object BotTO {

    def builder(): BotTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var databaseId: Option[Int] = _
        private var id: String = _
        private var login: String = _
        private var resourcePath: String = _
        private var updatedAt: String = _
        private var url: String = _

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

        def setLogin(login: String): Builder = {
            this.login = login
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setUpdatedAt(updatedAt: String): Builder = {
            this.updatedAt = updatedAt
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): BotTO = new BotTO(createdAt, databaseId, id, login, resourcePath, updatedAt, url)

    }
}
