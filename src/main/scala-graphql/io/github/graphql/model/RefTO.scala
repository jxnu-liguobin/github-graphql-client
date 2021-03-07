package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class RefTO(
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    prefix: String,
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    target: GitObjectTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (prefix != null) "prefix: " + GraphQLRequestSerializer.getEntry(prefix) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (target != null) "target: " + GraphQLRequestSerializer.getEntry(target) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RefTO {

    def builder(): RefTO.Builder = new Builder()

    class Builder {

        private var id: String = _
        private var name: String = _
        private var prefix: String = _
        private var repository: RepositoryTO = _
        private var target: GitObjectTO = _

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setPrefix(prefix: String): Builder = {
            this.prefix = prefix
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setTarget(target: GitObjectTO): Builder = {
            this.target = target
            this
        }

        def build(): RefTO = new RefTO(id, name, prefix, repository, target)

    }
}
