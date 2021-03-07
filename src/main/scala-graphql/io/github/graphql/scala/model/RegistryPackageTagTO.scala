package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class RegistryPackageTagTO(
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    name: String,
    version: RegistryPackageVersionTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
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
        val that = obj.asInstanceOf[RegistryPackageTagTO]
        Objects.equals(id, that.id) &&
        Objects.equals(name, that.name) &&
        Objects.equals(version, that.version)
    }

    override def hashCode(): Int = {
        Objects.hash(id, name, version)
    }
}

object RegistryPackageTagTO {

    def builder(): RegistryPackageTagTO.Builder = new Builder()

    class Builder {

        private var id: String = _
        private var name: String = _
        private var version: RegistryPackageVersionTO = _

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setVersion(version: RegistryPackageVersionTO): Builder = {
            this.version = version
            this
        }

        def build(): RegistryPackageTagTO = new RegistryPackageTagTO(id, name, version)

    }
}
