package io.github.graphql.scala.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import java.util.Objects
import scala.collection.JavaConverters._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-07T19:49:36+0800"
)
class QueryTO(
    codesOfConduct: Seq[CodeOfConductTO],
    @javax.validation.constraints.NotNull
    licenses: Seq[LicenseTO],
    @javax.validation.constraints.NotNull
    meta: GitHubMetadataTO,
    @javax.validation.constraints.NotNull
    relay: QueryTO,
    @javax.validation.constraints.NotNull
    viewer: UserTO
) {

    override def toString(): String = {
        Seq(
            if (codesOfConduct != null) "codesOfConduct: " + GraphQLRequestSerializer.getEntry(codesOfConduct.asJava) else "",
            if (licenses != null) "licenses: " + GraphQLRequestSerializer.getEntry(licenses.asJava) else "",
            if (meta != null) "meta: " + GraphQLRequestSerializer.getEntry(meta) else "",
            if (relay != null) "relay: " + GraphQLRequestSerializer.getEntry(relay) else "",
            if (viewer != null) "viewer: " + GraphQLRequestSerializer.getEntry(viewer) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }

    override def equals(obj: Any): Boolean = {
        if (this == obj) {
            return true
        }
        if (obj == null || getClass != obj.getClass) {
            return false
        }
        val that = obj.asInstanceOf[QueryTO]
        Objects.equals(codesOfConduct, that.codesOfConduct) &&
        Objects.equals(licenses, that.licenses) &&
        Objects.equals(meta, that.meta) &&
        Objects.equals(relay, that.relay) &&
        Objects.equals(viewer, that.viewer)
    }

    override def hashCode(): Int = {
        Objects.hash(codesOfConduct, licenses, meta, relay, viewer)
    }
}

object QueryTO {

    def builder(): QueryTO.Builder = new Builder()

    class Builder {

        private var codesOfConduct: Seq[CodeOfConductTO] = _
        private var licenses: Seq[LicenseTO] = _
        private var meta: GitHubMetadataTO = _
        private var relay: QueryTO = _
        private var viewer: UserTO = _

        def setCodesOfConduct(codesOfConduct: Seq[CodeOfConductTO]): Builder = {
            this.codesOfConduct = codesOfConduct
            this
        }

        def setLicenses(licenses: Seq[LicenseTO]): Builder = {
            this.licenses = licenses
            this
        }

        def setMeta(meta: GitHubMetadataTO): Builder = {
            this.meta = meta
            this
        }

        def setRelay(relay: QueryTO): Builder = {
            this.relay = relay
            this
        }

        def setViewer(viewer: UserTO): Builder = {
            this.viewer = viewer
            this
        }

        def build(): QueryTO = new QueryTO(codesOfConduct, licenses, meta, relay, viewer)

    }
}
