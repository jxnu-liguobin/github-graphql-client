package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class TreeEntryTO(
    mode: Int,
    @javax.validation.constraints.NotNull
    name: String,
    `object`: GitObjectTO,
    @javax.validation.constraints.NotNull
    oid: String,
    @javax.validation.constraints.NotNull
    repository: RepositoryTO,
    @javax.validation.constraints.NotNull
    `type`: String
) {

    override def toString(): String = {
        Seq(
            "mode: " + GraphQLRequestSerializer.getEntry(mode),
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (`object` != null) "object: " + GraphQLRequestSerializer.getEntry(`object`) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (`type` != null) "type: " + GraphQLRequestSerializer.getEntry(`type`) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object TreeEntryTO {

    def builder(): TreeEntryTO.Builder = new Builder()

    class Builder {

        private var mode: Int = _
        private var name: String = _
        private var `object`: GitObjectTO = _
        private var oid: String = _
        private var repository: RepositoryTO = _
        private var `type`: String = _

        def setMode(mode: Int): Builder = {
            this.mode = mode
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setObject(`object`: GitObjectTO): Builder = {
            this.`object` = `object`
            this
        }

        def setOid(oid: String): Builder = {
            this.oid = oid
            this
        }

        def setRepository(repository: RepositoryTO): Builder = {
            this.repository = repository
            this
        }

        def setType(`type`: String): Builder = {
            this.`type` = `type`
            this
        }

        def build(): TreeEntryTO = new TreeEntryTO(mode, name, `object`, oid, repository, `type`)

    }
}
