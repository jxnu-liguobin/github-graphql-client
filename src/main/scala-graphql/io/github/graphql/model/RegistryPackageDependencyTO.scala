package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import RegistryPackageDependencyTypeTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
)
class RegistryPackageDependencyTO(
    @javax.validation.constraints.NotNull
    dependencyType: RegistryPackageDependencyTypeTO,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    @javax.validation.constraints.NotNull
    version: String
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (dependencyType != null) "dependencyType: " + GraphQLRequestSerializer.getEntry(dependencyType) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (version != null) "version: " + GraphQLRequestSerializer.getEntry(version) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object RegistryPackageDependencyTO {

    def builder(): RegistryPackageDependencyTO.Builder = new Builder()

    class Builder {

        private var dependencyType: RegistryPackageDependencyTypeTO = _
        private var id: String = _
        private var name: String = _
        private var version: String = _

        def setDependencyType(dependencyType: RegistryPackageDependencyTypeTO): Builder = {
            this.dependencyType = dependencyType
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setVersion(version: String): Builder = {
            this.version = version
            this
        }

        def build(): RegistryPackageDependencyTO = new RegistryPackageDependencyTO(dependencyType, id, name, version)

    }
}
