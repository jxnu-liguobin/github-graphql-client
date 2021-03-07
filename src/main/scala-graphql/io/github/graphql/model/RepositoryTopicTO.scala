package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RepositoryTopicTO(
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    override val resourcePath: String,
    @javax.validation.constraints.NotNull
    topic: TopicTO,
    @javax.validation.constraints.NotNull
    override val url: String
) extends UniformResourceLocatableTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (topic != null) "topic: " + GraphQLRequestSerializer.getEntry(topic) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RepositoryTopicTO {

    def builder(): RepositoryTopicTO.Builder = new Builder()

    class Builder {

        private var id: String = _
        private var resourcePath: String = _
        private var topic: TopicTO = _
        private var url: String = _

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setTopic(topic: TopicTO): Builder = {
            this.topic = topic
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): RepositoryTopicTO = new RepositoryTopicTO(id, resourcePath, topic, url)

    }
}
