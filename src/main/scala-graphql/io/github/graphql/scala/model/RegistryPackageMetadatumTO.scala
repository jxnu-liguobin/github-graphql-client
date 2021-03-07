package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:37+0800"
)
class RegistryPackageMetadatumTO(
    @javax.validation.constraints.NotNull
    name: String,
    update: Option[Boolean],
    @javax.validation.constraints.NotNull
    value: String
) {

    override def toString(): String = {
        Seq(
            if (name != null) "name: " + GraphQLRequestSerializer.getEntry(name) else "",
            if (update.isDefined) "update: " + GraphQLRequestSerializer.getEntry(update.get) else "",
            if (value != null) "value: " + GraphQLRequestSerializer.getEntry(value) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[RegistryPackageMetadatumTO]
        Objects.equals(name, that.name) &&
        Objects.equals(update, that.update) &&
        Objects.equals(value, that.value)
    }

    override def hashCode(): Int = {
        Objects.hash(name, update, value)
    }
}

object RegistryPackageMetadatumTO {

    def builder(): RegistryPackageMetadatumTO.Builder = new Builder()

    class Builder {

        private var name: String = _
        private var update: Option[Boolean] = _
        private var value: String = _

        def setName(name: String): Builder = {
            this.name = name
            this
        }

        def setUpdate(update: Option[Boolean]): Builder = {
            this.update = update
            this
        }

        def setValue(value: String): Builder = {
            this.value = value
            this
        }

        def build(): RegistryPackageMetadatumTO = new RegistryPackageMetadatumTO(name, update, value)

    }
}
