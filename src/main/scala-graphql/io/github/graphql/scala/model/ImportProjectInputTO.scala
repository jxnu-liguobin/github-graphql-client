package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class ImportProjectInputTO(
    body: String,
    clientMutationId: String,
    @javax.validation.constraints.NotNull
    columnImports: Seq[ProjectColumnImportTO],
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    ownerName: String,
    public: Option[Boolean] = Some(false)
) {

    override def toString(): String = {
        Seq(
            if (body != null) "body: " + GraphQLRequestSerializer.getEntry(body) else "",
            if (clientMutationId != null) "clientMutationId: " + GraphQLRequestSerializer.getEntry(clientMutationId) else "",
            if (columnImports != null) "columnImports: " + GraphQLRequestSerializer.getEntry(columnImports.asJava) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (ownerName != null) "ownerName: " + GraphQLRequestSerializer.getEntry(ownerName) else "",
            if (public.isDefined) "public: " + GraphQLRequestSerializer.getEntry(public.get) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[ImportProjectInputTO]
        Objects.equals(body, that.body) &&
        Objects.equals(clientMutationId, that.clientMutationId) &&
        Objects.equals(columnImports, that.columnImports) &&
        Objects.equals(name, that.name) &&
        Objects.equals(ownerName, that.ownerName) &&
        Objects.equals(public, that.public)
    }

    override def hashCode(): Int = {
        Objects.hash(body, clientMutationId, columnImports, name, ownerName, public)
    }
}

object ImportProjectInputTO {

    def builder(): ImportProjectInputTO.Builder = new Builder()

    class Builder {

        private var body: String = _
        private var clientMutationId: String = _
        private var columnImports: Seq[ProjectColumnImportTO] = _
        private var name: String = _
        private var ownerName: String = _
        private var public: Option[Boolean] = Some(false)

        def setBody(body: String): Builder = {
            this.body = body
            this
        }

        def setClientMutationId(clientMutationId: String): Builder = {
            this.clientMutationId = clientMutationId
            this
        }

        def setColumnImports(columnImports: Seq[ProjectColumnImportTO]): Builder = {
            this.columnImports = columnImports
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setOwnerName(ownerName: String): Builder = {
            this.ownerName = ownerName
            this
        }

        def setPublic(public: Option[Boolean]): Builder = {
            this.public = public
            this
        }

        def build(): ImportProjectInputTO = new ImportProjectInputTO(body, clientMutationId, columnImports, name, ownerName, public)

    }
}
