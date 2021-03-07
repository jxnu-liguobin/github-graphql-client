package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class TagTO(
    @javax.validation.constraints.NotNull
    override val abbreviatedOid: String,
    @javax.validation.constraints.NotNull
    override val commitResourcePath: String,
    @javax.validation.constraints.NotNull
    override val commitUrl: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    message: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    override val oid: String,
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO,
    tagger: GitActorTO,
    @javax.validation.constraints.NotNull
    target: GitObjectTO
) extends GitObjectTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (abbreviatedOid != null) "abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid) else "",
            if (commitResourcePath != null) "commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath) else "",
            if (commitUrl != null) "commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (message != null) "message: " + GraphQLRequestSerializer.getEntry(message) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else "",
            if (tagger != null) "tagger: " + GraphQLRequestSerializer.getEntry(tagger) else "",
            if (target != null) "target: " + GraphQLRequestSerializer.getEntry(target) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[TagTO]
        Objects.equals(abbreviatedOid, that.abbreviatedOid) &&
        Objects.equals(commitResourcePath, that.commitResourcePath) &&
        Objects.equals(commitUrl, that.commitUrl) &&
        Objects.equals(id, that.id) &&
        Objects.equals(message, that.message) &&
        Objects.equals(name, that.name) &&
        Objects.equals(oid, that.oid) &&
        Objects.equals(repository, that.repository) &&
        Objects.equals(tagger, that.tagger) &&
        Objects.equals(target, that.target)
    }

    override def hashCode(): Int = {
        Objects.hash(abbreviatedOid, commitResourcePath, commitUrl, id, message, name, oid, repository, tagger, target)
    }
}

object TagTO {

    def builder(): TagTO.Builder = new Builder()

    class Builder {

        private var abbreviatedOid: String = _
        private var commitResourcePath: String = _
        private var commitUrl: String = _
        private var id: String = _
        private var message: String = _
        private var name: String = _
        private var oid: String = _
        private var repository: RepositoryTO = _
        private var tagger: GitActorTO = _
        private var target: GitObjectTO = _

        def setAbbreviatedOid(abbreviatedOid: String): Builder = {
            this.abbreviatedOid = abbreviatedOid
            this
        }

        def setCommitResourcePath(commitResourcePath: String): Builder = {
            this.commitResourcePath = commitResourcePath
            this
        }

        def setCommitUrl(commitUrl: String): Builder = {
            this.commitUrl = commitUrl
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setMessage(message: String): Builder = {
            this.message = message
            this
        }

        def setName(name: String): Builder = {
            this.name = name
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

        def setTagger(tagger: GitActorTO): Builder = {
            this.tagger = tagger
            this
        }

        def setTarget(target: GitObjectTO): Builder = {
            this.target = target
            this
        }

        def build(): TagTO = new TagTO(abbreviatedOid, commitResourcePath, commitUrl, id, message, name, oid, repository, tagger, target)

    }
}
