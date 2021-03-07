package io.github.graphql.model

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer
import scala.collection.JavaConverters._
import SponsorshipPrivacyTO._

@javax.annotation.Generated(
    value = Array("com.kobylynskyi.graphql.codegen.GraphQLCodegen"),
    date = "2021-03-06T19:48:00+0800"
)
class SponsorshipTO(
    @javax.validation.constraints.NotNull
    createdAt: String,
    @javax.validation.constraints.NotNull
    override val id: String,
    @javax.validation.constraints.NotNull
    maintainer: UserTO,
    @javax.validation.constraints.NotNull
    privacyLevel: SponsorshipPrivacyTO,
    sponsor: UserTO
) extends NodeTO {

    override def toString(): String = {
        Seq(
            if (createdAt != null) "createdAt: " + GraphQLRequestSerializer.getEntry(createdAt) else "",
            if (id != null) "id: " + GraphQLRequestSerializer.getEntry(id) else "",
            if (maintainer != null) "maintainer: " + GraphQLRequestSerializer.getEntry(maintainer) else "",
            if (privacyLevel != null) "privacyLevel: " + GraphQLRequestSerializer.getEntry(privacyLevel) else "",
            if (sponsor != null) "sponsor: " + GraphQLRequestSerializer.getEntry(sponsor) else ""
        ).filter(_ != "").mkString("{", ",", "}")
    }
}

object SponsorshipTO {

    def builder(): SponsorshipTO.Builder = new Builder()

    class Builder {

        private var createdAt: String = _
        private var id: String = _
        private var maintainer: UserTO = _
        private var privacyLevel: SponsorshipPrivacyTO = _
        private var sponsor: UserTO = _

        def setCreatedAt(createdAt: String): Builder = {
            this.createdAt = createdAt
            this
        }

        def setId(id: String): Builder = {
            this.id = id
            this
        }

        def setMaintainer(maintainer: UserTO): Builder = {
            this.maintainer = maintainer
            this
        }

        def setPrivacyLevel(privacyLevel: SponsorshipPrivacyTO): Builder = {
            this.privacyLevel = privacyLevel
            this
        }

        def setSponsor(sponsor: UserTO): Builder = {
            this.sponsor = sponsor
            this
        }

        def build(): SponsorshipTO = new SponsorshipTO(createdAt, id, maintainer, privacyLevel, sponsor)

    }
}
