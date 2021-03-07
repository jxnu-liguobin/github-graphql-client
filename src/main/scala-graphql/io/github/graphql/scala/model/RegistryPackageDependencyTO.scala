package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._
import RegistryPackageDependencyTypeTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
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

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RegistryPackageDependencyTO]
        Objects.equals(dependencyType, that.dependencyType) &&
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(version, that.version)
    }

    override def hashCode(): Int = {
        Objects.hash(dependencyType, id, name, version)
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
