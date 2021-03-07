package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class CodeOfConductTO(
    body: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    key: String,
    @javax.validation.constraints.NotNull
    name: String,
    resourcePath: String,
    url: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (key != null) "key: " + GraphQLRequestSerializer.getEntry(key) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (resourcePath != null) "resourcePath: " + GraphQLRequestSerializer.getEntry(resourcePath) else "",
            if (url != null) "url: " + GraphQLRequestSerializer.getEntry(url) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object CodeOfConductTO {

    def builder(): CodeOfConductTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var id: String = _
        private var key: String = _
        private var name: String = _
        private var resourcePath: String = _
        private var url: String = _

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setKey(key: String): Builder = {
            this.key = key
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setResourcePath(resourcePath: String): Builder = {
            this.resourcePath = resourcePath
            this
        }

        def setUrl(url: String): Builder = {
            this.url = url
            this
        }

        def build(): CodeOfConductTO = new CodeOfConductTO(body, id, key, name, resourcePath, url)

    }
}
