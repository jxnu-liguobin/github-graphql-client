package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class TreeTO(
    @javax.validation.constraints.NotNull
    override val abbreviatedOid: String,
    @javax.validation.constraints.NotNull
    override val commitResourcePath: String,
    @javax.validation.constraints.NotNull
    override val commitUrl: String,
    @javax.validation.constraints.NotNull
    entries: Seq[TreeEntryTO],
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    override val oid: String,
    @javax.validation.constraints.NotNull
    override val repository: RepositoryTO
) extends GitObjectTO with NodeTO {

    override def toString(): String = {
        Seq(
            if (abbreviatedOid != null) "abbreviatedOid: " + GraphQLRequestSerializer.getEntry(abbreviatedOid) else "",
            if (commitResourcePath != null) "commitResourcePath: " + GraphQLRequestSerializer.getEntry(commitResourcePath) else "",
            if (commitUrl != null) "commitUrl: " + GraphQLRequestSerializer.getEntry(commitUrl) else "",
            if (entries != null) "entries: " + GraphQLRequestSerializer.getEntry(entries.asJava) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (oid != null) "oid: " + GraphQLRequestSerializer.getEntry(oid) else "",
            if (repository != null) "repository: " + GraphQLRequestSerializer.getEntry(repository) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object TreeTO {

    def builder(): TreeTO.Builder = new Builder()

    class Builder {

        private var abbreviatedOid: String = _
        private var commitResourcePath: String = _
        private var commitUrl: String = _
        private var entries: Seq[TreeEntryTO] = _
        private var id: String = _
        private var oid: String = _
        private var repository: RepositoryTO = _

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

        def setEntries(entries: Seq[TreeEntryTO]): Builder = {
            this.entries = entries
            this
        }

        def setId(id: String): Builder = {
            this.id = id
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

        def build(): TreeTO = new TreeTO(abbreviatedOid, commitResourcePath, commitUrl, entries, id, oid, repository)

    }
}
