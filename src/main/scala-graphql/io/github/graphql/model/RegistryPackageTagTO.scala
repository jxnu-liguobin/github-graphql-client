package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:01+0800"
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
